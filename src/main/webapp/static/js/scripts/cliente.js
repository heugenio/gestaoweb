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

			var linha = null;
			$('#tblManClientes tbody').on('click', 'tr', function() {
				// $(this).toggleClass('selected');
				if ($(this).hasClass('selected')) {
					$(this).removeClass('selected');
				} else {
					// tabelaClientes.$('tr.selected').removeClass('selected');
					if (linha)
						linha.removeClass('selected')
					$(this).addClass('selected');
					linha = $(this);

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
		$('#btnAtualizarCliente').removeClass('hide');
		$('#btnSalvarCliente').addClass('hide');
		var obj = tabelaClientes.row('.selected').data();
		$('#corpoModal').load('buscapagina/alterar', function() {
			iniciaDatePiker();
			initFormValidate();
			inicializarScriptCampoDocumento();
			$('select').material_select();
			$('#pessNome').blur(function() {
				$('#pessRazaoSocial').val($('#pessNome').val());
			});
			$('#btnAtualizarCliente').click(function() {
				$("#formAlteraCliente").submit();
			});
			$("#formAlteraCliente").on('submit', function(e) {
				var isvalid = $("#formAlteraCliente").valid();
				if (isvalid) {
					e.preventDefault();
					var dados = $("#formAlteraCliente").serialize();
					var url = 'salvar';
					$.post(url, dados).done(function(pagina) {
						alert('Salvo com Sucesso!');
					}).fail(function() {
						alert('Erro ao alterar!');
					});
				}
			});
		});
	});

	$('#btnAdicionarCliente')
			.click(
					function() {
						$('#modalCliente').modal('open');
						$('#modalTituloCliente').text('Cadastro de Clientes');

						$('#btnSalvarCliente').removeClass('hide');
						$('#btnAtualizarCliente').addClass('hide');

						$('#corpoModal')
								.load(
										'buscapagina/cadastrar',
										function() {
											iniciaDatePiker();
											initFormValidate();
											inicializarScriptCampoDocumento();
											$('select').material_select();
											$('#pessNome')
													.blur(
															function() {
																$(
																		'#pessRazaoSocial')
																		.val(
																				$(
																						'#pessNome')
																						.val());
															});
											$('#btnSalvarCliente')
													.click(
															function() {
																var isvalid = $(
																		"#formAlteraCliente")
																		.valid();
																if (isvalid) {
																	var dados = $(
																			"#formAlteraCliente")
																			.serialize();
																	var url = 'salvar';
																	$
																			.post(
																					url,
																					dados)
																			.done(
																					function(
																							pessoa,
																							status,
																							jqxhr) {
																						var pessoas = [];
																						pessoas
																								.push(pessoa);
																						$(
																								'#tblManClientes')
																								.dataTable()
																								.fnDestroy();
																						$(
																								'#modalCliente')
																								.modal(
																										'close');
																						initDataTableClientes(pessoas);
																						Materialize
																								.toast(
																										'Cliente cadastrado com sucesso!',
																										4000);
																					})
																			.fail(
																					function(
																							retorno) {
																						// $('#modalCliente').modal('close');
																						if (retorno.status == '409') {
																							showMensageDialog('O CPF informado, ja existe na base de Dados!');
																						} else {
																							showMensageDialog('Ocorreu um erro ao salvar o cliente, por favor tente novamente. Se o erro persistir,entre em contato com o suporte.');
																						}
																					});
																}
															});
											$("#formAlteraCliente").on(
													'submit', function(e) {
														e.preventDefault();
													});
										});
					});

	$('#btnExcluirCliente')
			.click(
					function() {
						if ($('#tblManClientes >tbody >tr').length > 0) {
							var obj = tabelaClientes.row('.selected').data();
							if (obj === 'undefined') {
								showMensageDialog('Você precisa selecionar um cliente para excluir!');
							} else {
								showConfirmDialog(
										'Tem certeza que deseja excluir o cliente <strong>'
												+ obj.pessNome
												+ '</strong> ? <br> <small>Está ação não poderá ser desfeita.</small>',
										'Sim',
										'Não',
										function(retorno) {
											if (retorno) {
												var url = 'deletar/'
														+ obj.pessId;
												$
														.post(url)
														.done(
																function(
																		retorno,
																		status) {
																	tabelaClientes
																			.row(
																					'.selected')
																			.remove()
																			.draw(
																					false);
																});
											}
										});
							}
						} else {
							showMensageDialog('Você precisa selecionar um cliente para excluir!');
						}
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
			data : "pessCodigo",
			title : "Código"
		}, {
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
