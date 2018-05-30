<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<form id="formAlteraCliente">
	<input type="hidden" id="pessId" name="pessId" value="" />
	<div class="row">
		<div class="input-field col s12">
			<label for="pessNome">Nome Completo/Fantasia *</label> <input
				id="pessNome" name="pessNome" type="text" data-error=".errorTxt1">
			<div class="errorTxt1"></div>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s12">
			<label for="pessRazaoSocial">Razão Social *</label> <input
				id="pessRazaoSocial" name="pessRazaoSocial" type="text"
				data-error=".errorTxt2">
			<div class="errorTxt2"></div>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s4">
			<label for="pessCpfcnpj">CPF/CNPJ *</label> <input id="pessCpfcnpj"
				name="pessCpfcnpj" type="text" class="campo-documento"
				data-error=".errorTxt3">
			<div class="errorTxt3"></div>
		</div>
		<div class="input-field col s4">
			<label for="pessDataNascimento">Data de Nascimento *</label> <input
				id="pessDataNascimento" name="pessDataNascimento" type="text"
				class="datePikerGeral" data-error=".errorTxt4">
			<div class="errorTxt4"></div>
		</div>
		<div class="input-field col s4">
			<select data-error=".errorTxt5" id="pessFisicoJuridico"
				name="pessFisicoJuridico">
				<option value="" disabled selected>Escolha uma opção</option>
				<option value="Física">Física</option>
				<option value="Jurídica">Jurídica</option>
			</select> <label for="pessFisicoJuridico">Tipo *</label>
			<div class="errorTxt5"></div>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s4">
			<select data-error=".errorTxt6" id="pessEscolaridade"
				name="pessEscolaridade">
				<option value="" disabled selected>Escolha uma opção</option>
				<c:forEach items="${listaEscolaridade}" var="escolaridade">
					<option value="${escolaridade}">${escolaridade}</option>
				</c:forEach>
			</select> <label for="pessEscolaridade">Escolaridade</label>
			<div class="errorTxt6"></div>
		</div>
		<div class="input-field col s4">
			<select data-error=".errorTxt7" id="pessEstadoCivil"
				name="pessEstadoCivil">
				<option value="" disabled selected>Escolha uma opção</option>
				<c:forEach items="${listaEstadoCivil}" var="estadoCivil">
					<option value="${estadoCivil}">${estadoCivil}</option>
				</c:forEach>
			</select> <label for="pessEstadoCivil">Estado Civil</label>
			<div class="errorTxt7"></div>
		</div>
		<div class="input-field col s4">
			<select data-error=".errorTxt8" id="pessSexo" name="pessSexo">
				<option value="Masculino" selected>Masculino</option>
				<option value="Feminino">Feminino</option>
			</select> <label for="pessSexo">Sexo</label>
			<div class="errorTxt8"></div>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s4">
			<select data-error=".errorTxt9" id="cargId" name="cargId">
				<option value="" disabled selected>Escolha uma opção</option>
				<c:forEach items="${listaCargos}" var="cargos">
					<option value="${cargos.cargId}">${cargos.cargNome}</option>
				</c:forEach>
			</select> <label for="cargId">Cargo</label>
			<div class="errorTxt9"></div>
		</div>
		<div class="input-field col s4">
			<select data-error=".errorTxt10" id="profId" name="profId">
				<option value="" disabled selected>Escolha uma opção</option>
				<c:forEach items="${listaProfissoes}" var="profissao">
					<option value="${profissao.profId}">${profissao.profNome}</option>
				</c:forEach>
			</select> <label for="profId">Profissão</label>
			<div class="errorTxt10"></div>
		</div>
		<div class="input-field col s4">
			<select data-error=".errorTxt11" id="ncndId" name="ncndId">
			<option value="" disabled selected>Escolha uma opção</option>
			<c:forEach items="${listaNacionalidades}" var="nacionalidade">
					<option value="${nacionalidade.ncndId}">${nacionalidade.ncndNome}</option>
				</c:forEach>
			</select> <label for="ncndId">Nacionalidade</label>
			<div class="errorTxt11"></div>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s4">
			<label for="pessUrl">Site</label> <input id="pessUrl" name="pessUrl"
				type="url" data-error=".errorTxt12">
			<div class="errorTxt12"></div>
		</div>
		<div class="input-field col s4">
			<label for="pessEmail">Email</label> <input id="pessEmail"
				name="pessEmail" type="email" data-error=".errorTxt13">
			<div class="errorTxt13"></div>
		</div>
		<div class="input-field col s4">
			<select data-error=".errorTxt14" id="pessSituacao"
				name="pessSituacao">
				<option value="Ativo">Ativo</option>
				<option value="Inativo">Inativo</option>
			</select> <label for="pessSituacao">Situação</label>
			<div class="errorTxt14"></div>
		</div>
	</div>
	<div class="row">
		<div class="input-field col s12">
			<label for="pessObservacao">Observação</label>
			<textarea id="pessObservacao" name="pessObservacao"
				data-error=".errorTxt15" class="materialize-textarea"></textarea>
			<div class="errorTxt15"></div>
		</div>
	</div>
</form>