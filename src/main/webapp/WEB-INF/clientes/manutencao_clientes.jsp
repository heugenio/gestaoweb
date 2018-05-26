<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<jsp:include page="../fragments/cabecalho.jsp" />
<jsp:include page="../fragments/menu.jsp" />


<div id="breadcrumbs-wrapper">
	<!-- Search for small screen -->
	<div class="container">
		<div class="row">
			<div class="col s12 m12 l12">
				<h5 class="breadcrumbs-title">Manutenção de Clientes</h5>
				<div class="input-field col s4">
					<input id="cpf" type="text" class="validate campo-documento">
					<label for="CPF/CNPJ">CPF/CNPJ</label>
				</div>
				<div class="input-field col s7">
					<input id="nome" type="text" class="validate"> <label
						for="Nome">Nome</label>
				</div>
				<div class="input-field col s1">
					<a class="btn waves-effect waves-light btn-small"
						id="btnBuscaClientes"><i class="material-icons">search</i></a>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="container">
	<div class="section">
		<!--  contéudo da página -->
		<div class="row">
			<div class="col s12 m12 l12">
				<table id='tblManClientes'
					class="highlight nowrap row-border cell-border order-column">
					<thead>
						<tr>
							<th>CPF/CNPJ</th>
							<th>Nome</th>
							<th>Razão Social</th>
							<th>Tipo</th>
						</tr>
					</thead>
					<tbody></tbody>
				</table>
			</div>
		</div>
		<!--  fim do Conteudo -->
		<!-- Floating Action Button -->
		<div class="fixed-action-btn " style="bottom: 50px; right: 19px;">
			<a
				class="btn-floating btn-large gradient-45deg-light-blue-cyan gradient-shadow">
				<i class="material-icons">add</i>
			</a>
			<ul>
				<li><a id="btnAdicionarCliente"
					class="btn-floating blue tooltipped" data-position="left"
					data-delay="50" data-tooltip="Adicionar cliente"> <i
						class="material-icons">person_add</i>
				</a></li>
				<li><a id="btnAlterarCliente"
					class="btn-floating green tooltipped" data-position="left"
					data-delay="50" data-tooltip="Alterar cliente selecionado"> <i
						class="material-icons">transfer_within_a_station</i>
				</a></li>
				<li><a id="btnExcluirCliente"
					class="btn-floating amber tooltipped" data-position="left"
					data-delay="50" data-tooltip="Excluir cliente selecionado"> <i
						class="material-icons">delete_forever</i>
				</a></li>
			</ul>
		</div>
		<!-- Floating Action Button -->
	</div>
</div>


<!-- Modal de Interação com o Usuario -->
<div id="modalCliente" class="modal modal-fixed-footer">
	<div class="modal-content">
		<h4 id="modalTituloCliente" >Modal Header</h4>
		<div class="divider"></div>
		<div class="container" id="corpoModal">
		
		</div>
	</div>
	<div class="modal-footer">
	<a href="#!"
			class="modal-action modal-close waves-effect waves-green btn-flat">Cancelar</a>
		<a href="#!"
			class="waves-effect waves-green btn-flat" id="btnSalvarCuringa" >Salvar</a>
	</div>
</div>
<!--Fim do Modal -->

<jsp:include page="../fragments/rodape.jsp" />
<!-- Script da Pagina -->
<script type="text/javascript"
	src="${path}/static/js/scripts/cliente.js"></script>



