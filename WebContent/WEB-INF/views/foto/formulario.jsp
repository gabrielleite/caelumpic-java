<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="caelum" tagdir="/WEB-INF/tags" %>
<caelum:template>
	<jsp:body>
		<h1>Cadastro de Foto</h1>
		<div class="divider"></div>
		<form action="persistirFoto" method="post" class="col s12">
			<input type="hidden" name="id" value="${foto.id}" />
			<div class="row">
				<div class="col s12 m6">
					<div class="row">
						<div class="input-field col s12">
							<i class="material-icons prefix">title</i>
							<input id="foto_titulo" type="text" class="validate" name="titulo"
								value="${foto.titulo}">
							<label for="foto_titulo">Título</label>
						</div>
					</div>
					<div class="row">
						<div class="col s12 hide-on-med-and-up">
							<img class="preview-image responsive-img">
						</div>
						<div class="input-field col s12">
							<i class="material-icons prefix">link</i>
							<input id="foto_endereco" type="text" class="validate" 
								name="endereco" value="${foto.endereco}">
							<label for="foto_endereco">Endereço</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<i class="material-icons prefix">today</i>
							<input id="foto_data_criacao" type="text" class="datepicker"
								name="dataCriacao"
								value="<fmt:formatDate value="${foto.dataCriacao.time}" 
											pattern="dd/MM/yyyy" />">
							<label for="foto_data_criacao">Data Criação</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s12">
							<i class="material-icons prefix">description</i>
							<textarea id="foto_descricao" class="materialize-textarea"
									name="descricao">${foto.descricao}</textarea>
							<label for="foto_descricao">Descrição</label>
						</div>
					</div>
				</div>
				<div class="col m6 hide-on-small-only">
					<img class="preview-image responsive-img" >
				</div>
			</div>
			<div class="row">
				<button class="btn waves-effect waves-light" type="submit" name="action">
					Enviar
					<i class="material-icons right">send</i>
				</button>
			</div>
	    </form>
	    <script type="text/javascript" src="../resources/js/jquery-3.2.1.min.js"></script>
	    <script type="text/javascript" src="../resources/js/materialize.min.js"></script>
	    <script>
	    	$('.datepicker').pickadate({
		    	selectMonths: true, // Creates a dropdown to control month
		    	selectYears: 15, // Creates a dropdown of 15 years to control year,
		    	today: 'Hoje',
		    	clear: 'Apagar',
		    	close: 'Ok',
		    	closeOnSelect: false, // Close upon selecting a date.
		    	format: 'dd/mm/yyyy'
		    });
		    $('#foto_endereco').blur(function(event) {
			    let campoEndereco = event.target;
			    $('.preview-image').attr('src', campoEndereco.value);
			});
	    </script>
	</jsp:body>
</caelum:template>