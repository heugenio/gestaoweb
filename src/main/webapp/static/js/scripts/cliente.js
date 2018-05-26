/**
 * Hj-Systems Ltda. Autor: Daniel Filho Data : 21/05/2018
 */

var tabelaClientes;

$(document).ready(
		function() {
			$('.modal').modal();
			initBotoesManutencaoClientes();

			$('.tooltipped').tooltip({
				delay : 50
			});

			$('#tblManClientes tbody').on('click', 'tr', function() {
				// $(this).toggleClass('selected');
				if ($(this).hasClass('selected')) {
					$(this).removeClass('selected');
				} else {
					tabelaClientes.$('tr.selected').removeClass('selected');
					$(this).addClass('selected');
				}
			});

			$('#cpf').on('propertychange change paste input keyup mouseup',
					function() {
						$('#nome').prop("disabled", $('#cpf').val() !== '');
					});
			$('#nome').on('propertychange change paste input keyup mouseup',
					function() {
						$('#cpf').prop("disabled", $('#nome').val() !== '');
					});

		});

var initBotoesManutencaoClientes = function() {
	$('#btnBuscaClientes').click(function() {
		$('body').removeClass('loaded');
		$("#tblManClientes").dataTable().fnDestroy();
		var pesquisa = '';
		var tipoPes = 'nome';
		if ($('#cpf').val() != '') {
			pesquisa = converteNumerosString($('#cpf').val());
			tipoPes = 'cpf';
		} else if ($('#nome').val() != '') {
			pesquisa = $('#nome').val();
			tipoPes = 'nome';
		}

		var url = "pesquisa/" + tipoPes + "/" + pesquisa;
		$.get(url, function(pessoas, status) {
			initDataTableClientes(pessoas);
			$('body').addClass('loaded');
		});
	});

	$('#btnAlterarCliente').click(function() {
		$('#modalCliente').modal('open');
		$('#modalTituloCliente').text('Alteração de Cliente');
		var obj = tabelaClientes.row('.selected').data();

		$('#corpoModal').load('buscapagina/alterar', function() {
			iniciaDatePiker();
			initFormValidate();
			inicializarScriptCampoDocumento();
			$('select').material_select();
			$('#btnSalvarCuringa').attr('id', 'btnSalvarAlteracao');
			$('#pessNome').blur(function() {
				$('#pessRazaoSocial').val($('#pessNome').val());
			});

			$('#btnSalvarAlteracao').click(function() {
				$("#formAlteraCliente").submit();
			});
			
		    $("#formAlteraCliente").on('submit', function(e) {
		        var isvalid = $("#formAlteraCliente").valid();
		        if (isvalid) {
		            e.preventDefault();
		            alert('Parei o submit');
		        }
		    });

		});
	});

};

var initDataTableClientes = function(pessoas) {
	tabelaClientes = $('#tblManClientes').DataTable({
		paging : true,
		searching : false,
		ordering : true,
		info : true,
		lengthMenu : [ [ 10, 25, 50, -1 ], [ 10, 25, 50, "All" ] ],
		language : languagePtBr,
		data : pessoas,
		columns : [ {
			data : "pessCpfcnpj",
			title : "CPF/CNPJ",
			mRender : function(data, type, row) {
				return formatarDocumento(data);
			}
		}, {
			data : "pessNome",
			title : "Nome"
		}, {
			data : "pessRazaoSocial",
			title : "Razão Social"
		}, {
			data : "pessFisicoJuridico",
			title : "Tipo"
		}, ],
		deferRender : true
	});
};

var initFormValidate = function() {
	$("#formAlteraCliente").validate({
		rules : {
			pessNome : {
				required : true,
			},
			pessRazaoSocial : {
				required : true,
			},
			pessCpfcnpj : {
				required : true,
			},
			pessDataNascimento : {
				required : true,
			},
			pessFisicoJuridico : {
				required : true,
			},
			pessUrl : {
				required : false,
				url : false
			}
		},
		// For custom messages
		messages : {
			pessNome : {
				required : "O nome do cliente é obrigatório !",
			// minlength: "Enter at least 5 characters"
			},
			pessRazaoSocial : {
				required : "A razão social é obrigatória !",
			// minlength: "Enter at least 5 characters"
			},
			pessCpfcnpj : {
				required : "O CPF/CNPJ é obrigatório !",
			// minlength: "Enter at least 5 characters"
			},
			pessDataNascimento : {
				required : "A data de nascimento é obrigatória !",
			// minlength: "Enter at least 5 characters"
			},
			pessFisicoJuridico : {
				required : "Selecione o tipo de pessoa !",
			// minlength: "Enter at least 5 characters"
			}
		},
		errorElement : 'div',
		errorPlacement : function(error, element) {
			var placement = $(element).data('error');
			if (placement) {
				$(placement).append(error)
			} else {
				error.insertAfter(element);
			}
		}
	});
}
