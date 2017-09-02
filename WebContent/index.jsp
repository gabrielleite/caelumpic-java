<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>CaelumPic</title>
				
		<!--Import Google Icon Font-->
		<link href="resources/css/google-fonts.css" rel="stylesheet">
		<!--Import materialize.css-->
		<link type="text/css" rel="stylesheet" href="resources/css/materialize.min.css"
			media="screen,projection" />
		<link href="resources/css/caelumpic.css" rel="stylesheet">
		
		<!--Let browser know website is optimized for mobile-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	</head>
	<body>
		<!-- Cabecalho -->
		<header>
			<div class="navbar-fixed">
				<nav>
					<div class="nav-wrapper">
						<a href="#!" class="brand-logo">
							<img alt="Caelum" src="resources/images/logo-caelum.png">
						</a>
						<a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
						<ul class="right hide-on-med-and-down">
							<!-- IMPORTAR MENU -->
							<c:import url="menu.jsp" />
						</ul>
					</div>
				</nav>
			</div>
			<ul class="side-nav" id="mobile-demo">
				<!-- IMPORTAR MENU -->
				<c:import url="menu.jsp" />
			</ul>
		</header>
		
		<main>
			<div class="container">
				<div class="row">
					<div class="col s12 m6 l4">
						<div class="card sticky-action">
							<div class="card-image waves-effect waves-block waves-light">
								<img class="activator" src="http://materializecss.com/images/office.jpg">
							</div>
							<div class="card-content">
								<span class="card-title activator grey-text text-darken-4">
									Título da foto
									<i class="material-icons right">more_vert</i></span>
									<p>Data de criação: 01/09/2017</p>
							</div>
							<div class="card-reveal">
								<span class="card-title grey-text text-darken-4">
									Título da foto
									<i class="material-icons right">close</i>
								</span>
								<p>Descrição da foto.</p>
							</div>
							<div class="card-action">
								<div class="row">
									<a class="col s6 waves-effect waves-light btn btn-flat btn-edit">
										<i class="material-icons left">edit</i>
										Editar
									</a>
									<a class="col s6 waves-effect waves-light btn btn-flat btn-delete">
										<i class="material-icons left">delete_forever</i>
										Remover
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="fixed-action-btn">
				<a class="btn-floating btn-large red darken-4">
					<i class="large material-icons">add_a_photo</i>
				</a>
			</div>
		</main>
		
		<footer class="page-footer">
			<div class="container">
				<div class="row">
					<div class="col l6 s12">
						<h5 class="white-text">CaelumPic</h5>
						<p class="grey-text text-lighten-4">
							Álbum de fotos da Caelum.
						</p>
					</div>
					<div class="links col l4 offset-l2 s12">
						<h5 class="white-text">Links</h5>
						<ul>
							<li>
								<a class="grey-text text-lighten-3" target="_blank" href="https://github.com/gabrielleite">
									<img alt="Github" src="resources/images/logo-github.svg" class="left">
									Gabriel Leite - Repositórios
								</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="footer-copyright">
				<div class="container">
					© 2017 Copyright
					<a class="grey-text text-lighten-4 right" href="https://www.caelum.com.br/">Caelum</a>
				</div>
			</div>
		</footer>
	
		<!--Import jQuery before materialize.js-->
		<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="resources/js/materialize.min.js"></script>
		<script type="text/javascript" src="resources/js/caelumpic.js"></script>
	</body>
</html>