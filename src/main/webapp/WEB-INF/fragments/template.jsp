<%@ page language="java" pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="msapplication-tap-highlight" content="no">
<meta name="description"
	content="Materialize is a Material Design Admin Template,It's modern, responsive and based on Material Design by Google. ">
<meta name="keywords"
	content="materialize, admin template, dashboard template, flat admin template, responsive admin template,">
<title>Página em Branco | Gestão Web - Gerenciador Financeiro</title>
<!-- Favicons-->
<link rel="icon" href="@{/images/favicon/favicon-32x32.png}"
	sizes="32x32">
<!-- Favicons-->
<link rel="apple-touch-icon-precomposed"
	href="@{/images/favicon/apple-touch-icon-152x152.png}">
<!-- For iPhone -->
<meta name="msapplication-TileColor" content="#00bcd4">
<meta name="msapplication-TileImage"
	content="images/favicon/mstile-144x144.png">
<!-- For Windows Phone -->
<!-- CORE CSS-->
<link href="@{/css/themes/semi-dark-menu/materialize.css}"
	type="text/css" rel="stylesheet">
<link href="@{/css/themes/semi-dark-menu/style.css}" type="text/css"
	rel="stylesheet">
<!-- Custome CSS-->
<link href="@{/css/custom/custom.css}" type="text/css"
	rel="stylesheet">
<!-- INCLUDED PLUGIN CSS ON THIS PAGE -->
<link href="@{/vendors/perfect-scrollbar/perfect-scrollbar.css}"
	type="text/css" rel="stylesheet">
<link href="@{/vendors/flag-icon/css/flag-icon.min.css}"
	type="text/css" rel="stylesheet">
</head>
<body class="layout-semi-dark">
	<!-- Start Page Loading -->
	<div id="loader-wrapper">
		<div id="loader"></div>
		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>
	</div>
	<!-- End Page Loading -->
	<!-- //////////////////////////////////////////////////////////////////////////// -->
	<!-- START HEADER -->
	<header id="header" class="page-topbar">
		<!-- start header nav-->
		<div class="navbar-fixed">
			<nav class="navbar-color">
				<div class="nav-wrapper">
					<div class="header-search-wrapper hide-on-med-and-down">
						<i class="material-icons">search</i> <input type="text"
							name="Search" class="header-search-input z-depth-2"
							placeholder="Explorar o Sistema" />
					</div>
					<ul class="right hide-on-med-and-down">
						<li><a href="javascript:void(0);"
							class="waves-effect waves-block waves-light toggle-fullscreen">
								<i class="material-icons">settings_overscan</i>
						</a></li>
						<li><a href="javascript:void(0);"
							class="waves-effect waves-block waves-light notification-button"
							data-activates="notifications-dropdown"> <i
								class="material-icons">notifications_none <small
									class="notification-badge">1</small>
							</i>
						</a></li>
						<li><a href="javascript:void(0);"
							class="waves-effect waves-block waves-light profile-button"
							data-activates="profile-dropdown"> <span
								class="avatar-status avatar-online"> <img
									src="@{images/avatar/avatar-7.png}" alt="avatar"> <i></i>
							</span>
						</a></li>
						<!-- 
              <li>
                <a href="#" data-activates="chat-out" class="waves-effect waves-block waves-light chat-collapse">
                  <i class="material-icons">format_indent_increase</i>
                </a>
              </li>
               -->
					</ul>
					<!-- notifications-dropdown -->
					<ul id="notifications-dropdown" class="dropdown-content">
						<li>
							<h6>
								NOTIFICAÇÕES <span class="new badge">1</span>
							</h6>
						</li>
						<li class="divider"></li>
						<li><a href="#!" class="grey-text text-darken-2"> <span
								class="material-icons icon-bg-circle cyan small">add_shopping_cart</span>
								A new order has been placed!
						</a> <time class="media-meta" datetime="2015-06-12T20:50:48+08:00">2
								hours ago</time></li>
					</ul>
					<!-- profile-dropdown -->
					<ul id="profile-dropdown" class="dropdown-content">
						<li><a href="#" class="grey-text text-darken-1"> <i
								class="material-icons">face</i> Perfil
						</a></li>
						<li><a href="#" class="grey-text text-darken-1"> <i
								class="material-icons">settings</i> Configurações
						</a></li>
						<li><a href="#" class="grey-text text-darken-1"> <i
								class="material-icons">live_help</i> Ajuda
						</a></li>
						<li class="divider"></li>
						<!-- 
	              <li>
	                <a href="#" class="grey-text text-darken-1">
	                  <i class="material-icons">lock_outline</i> Lock</a>
	              </li>
              -->
						<li><a href="#" class="grey-text text-darken-1"> <i
								class="material-icons">keyboard_tab</i> Sair
						</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</header>
	<!-- END HEADER -->
	<!-- //////////////////////////////////////////////////////////////////////////// -->
	<!-- START MAIN -->
	<div id="main" class="main-full">
		<!-- START WRAPPER -->
		<div class="wrapper">
			<!-- START LEFT SIDEBAR NAV-->
			<aside id="left-sidebar-nav" class="nav-collapsible nav-collapsed">
				<div class="brand-sidebar">
					<h1 class="logo-wrapper">
						<a href="index.html" class="brand-logo darken-1"> <img
							src="@{/images/logo/materialize-logo.png}"
							alt="Logo do Sistema"> <span
							class="logo-text hide-on-med-and-down">Gestão</span>
						</a> <a href="#" class="navbar-toggler"> <i class="material-icons">radio_button_unchecked</i>
						</a>
					</h1>
				</div>
				<ul id="slide-out" class="side-nav fixed leftside-navigation">
					<li class="no-padding">
						<ul class="collapsible" data-collapsible="accordion">
							<li class="bold"><a
								class="collapsible-header  waves-effect waves-cyan active">
									<i class="material-icons">add_shopping_cart</i> <span
									class="nav-text">Vendas</span>
							</a>
								<div class="collapsible-body">
									<ul>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Ordem
													de Serviço</span>
										</a></li>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Faturamento
													de Venda</span>
										</a></li>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Demonstrativo
													de Vendas</span>
										</a></li>
									</ul>
								</div></li>
						</ul>
					</li>
					<li class="no-padding">
						<ul class="collapsible" data-collapsible="accordion">
							<li class="bold"><a
								class="collapsible-header  waves-effect waves-cyan active">
									<i class="material-icons">storage</i> <span class="nav-text">Estoque</span>
							</a>
								<div class="collapsible-body">
									<ul>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Consulta
													de Estoque</span>
										</a></li>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Ajuste
													de Estoque</span>
										</a></li>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Registro
													de Inventário</span>
										</a></li>
									</ul>
								</div></li>
						</ul>
					</li>
					<li class="no-padding">
						<ul class="collapsible" data-collapsible="accordion">
							<li class="bold"><a
								class="collapsible-header  waves-effect waves-cyan active">
									<i class="material-icons">content_paste</i> <span
									class="nav-text">Notas Fiscais</span>
							</a>
								<div class="collapsible-body">
									<ul>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Consulta
													de Notas Fiscais</span>
										</a></li>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Entrada
													de Notas Fiscais</span>
										</a></li>
									</ul>
								</div></li>
						</ul>
					</li>
					<li class="no-padding">
						<ul class="collapsible" data-collapsible="accordion">
							<li class="bold"><a
								class="collapsible-header  waves-effect waves-cyan active">
									<i class="material-icons">create</i> <span class="nav-text">Cadastros</span>
							</a>
								<div class="collapsible-body">
									<ul>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Manutenção
													de Clientes</span>
										</a></li>
										<li class=""><a href="@{/}"> <i
												class="material-icons">keyboard_arrow_right</i> <span>Manutenção
													de Veiculos</span>
										</a></li>
									</ul>
								</div></li>
						</ul>
					</li>
					<!--
            <li>
              <a href="https://pixinvent.ticksy.com" target="_blank">
                <i class="material-icons">help_outline</i>
                <span class="nav-text">Support</span>
              </a>
            </li>
            -->
				</ul>
				<a href="#" data-activates="slide-out"
					class="sidebar-collapse btn-floating btn-medium waves-effect waves-light hide-on-large-only gradient-45deg-light-blue-cyan gradient-shadow">
					<i class="material-icons">menu</i>
				</a>
			</aside>
			<!-- END LEFT SIDEBAR NAV-->
			<!-- //////////////////////////////////////////////////////////////////////////// -->
			<!-- START CONTENT -->
			<section id="content">
				<!--start container-->
				<div class="container">
					<div class="section">
						<p class="caption">A Simple Blank Page to use it for your
							custome design and elements.</p>
						<div class="divider"></div>
					</div>
					<!-- Floating Action Button -->
					<div class="fixed-action-btn " style="bottom: 50px; right: 19px;">
						<a
							class="btn-floating btn-large gradient-45deg-light-blue-cyan gradient-shadow">
							<i class="material-icons">add</i>
						</a>
						<ul>
							<li><a href="css-helpers.html" class="btn-floating blue">
									<i class="material-icons">help_outline</i>
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
				<!--end container-->
			</section>
			<!-- END CONTENT -->
		</div>
		<!-- END WRAPPER -->
	</div>
	<!-- END MAIN -->
	<!-- //////////////////////////////////////////////////////////////////////////// -->
	<!-- START FOOTER -->
	<footer class="page-footer">
		<div class="footer-copyright">
			<div class="container">
				<span>Copyright © <script type="text/javascript">
					document.write(new Date().getFullYear());
				</script>-2018 <a class="light-blue-text text-darken-3"
					href="http://hjsystems.com.br" target="_blank">HJ-SYSTEMS Ltda</a>.
					Todos os direitos são reservados.
				</span>
				<!-- <span class="right hide-on-small-only"> Design and Developed by <a class="grey-text text-lighten-4" href="https://pixinvent.com/">PIXINVENT</a></span>-->
			</div>
		</div>
	</footer>
	<!-- END FOOTER -->
	<!-- ================================================
        Scripts
  ================================================ -->
	<!-- jQuery Library -->
	<script type="text/javascript" src="@{/vendors/jquery-3.2.1.min.js}"></script>
	<!--materialize js-->
	<script type="text/javascript" src="@{/js/materialize.min.js}"></script>
	<!--scrollbar-->
	<script type="text/javascript"
		src="@{/vendors/perfect-scrollbar/perfect-scrollbar.min.js}"></script>
	<!--plugins.js - Some Specific JS codes for Plugin Settings-->
	<script type="text/javascript" src="@{/js/plugins.js}"></script>
	<!--custom-script.js - Add your own theme custom JS-->
	<script type="text/javascript" src="@{/js/custom-script.js}"></script>
</body>
</html>