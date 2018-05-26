<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath}"
	scope="request"></c:set>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="msapplication-tap-highlight" content="no">
<meta name="description"
	content="Gerenciador financeiro para seu negocio. Ferramenta personalizada de gestão e frente de caixa para redes de lojas ou franquias.">
<meta name="keywords"
	content="Gerenciador financeiro, frente de caixa, lucro, gestao, financeiro, ">
<title>Gestão Web - Gerenciador Financeiro</title>
<!-- Favicons-->
<link rel="icon" href="${path}/static/images/favicon/favicon-32x32.png"
	sizes="32x32">
<!-- Favicons-->
<link rel="apple-touch-icon-precomposed"
	href="${path}/static/images/favicon/apple-touch-icon-152x152.png">
<!-- For iPhone -->
<meta name="msapplication-TileColor" content="#00bcd4">
<meta name="msapplication-TileImage"
	content="${path}/static/images/favicon/mstile-144x144.png">
<!-- Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<!-- CORE CSS-->
<link href="${path}/static/css/themes/semi-dark-menu/materialize.css"
	type="text/css" rel="stylesheet">
<link href="${path}/static/css/themes/semi-dark-menu/style.css"
	type="text/css" rel="stylesheet">
<!-- Custome CSS-->
<link href="${path}/static/css/custom/custom.css" type="text/css"
	rel="stylesheet">
<!-- INCLUDED PLUGIN CSS ON THIS PAGE -->
<link
	href="${path}/static/vendors/perfect-scrollbar/perfect-scrollbar.css"
	type="text/css" rel="stylesheet">
<link href="${path}/static/vendors/flag-icon/css/flag-icon.min.css"
	type="text/css" rel="stylesheet">
<link
	href="${path}/static/vendors/data-tables/css/jquery.dataTables.min.css"
	type="text/css" rel="stylesheet">
</head>