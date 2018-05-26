<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<jsp:include page="fragments/cabecalho.jsp" />
<jsp:include page="fragments/menu.jsp" />

<div class="container">
	<div class="section">
		<p class="caption">Esta e a pagina inicial do sistema.</p>
		<div class="divider"></div>
	</div>
	<!-- Floating Action Button -->
	<div class="fixed-action-btn " style="bottom: 50px; right: 19px;">
		<a
			class="btn-floating btn-large gradient-45deg-light-blue-cyan gradient-shadow">
			<i class="material-icons">add</i>
		</a>
		<ul>
			<li><a href="css-helpers.html" class="btn-floating blue"> <i
					class="material-icons">help_outline</i>
			</a></li>
			<li><a href="cards-extended.html" class="btn-floating green">
					<i class="material-icons">widgets</i>
			</a></li>
			<li><a href="app-calendar.html" class="btn-floating amber">
					<i class="material-icons">today</i>
			</a></li>
			<li><a href="app-email.html" class="btn-floating red"> <i
					class="material-icons">mail_outline</i>
			</a></li>
		</ul>
	</div>
	<!-- Floating Action Button -->
</div>


<jsp:include page="fragments/rodape.jsp" />



