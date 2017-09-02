<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
	Criação de um atributo obrigatório chamado foto para a tag fotoCartao.
	E definição que o atributo deve receber uma informação do tipo Foto.
	
	A partir de agora, sempre que quiser acessar a informação da foto
	que for passada como parâmetro para essa tag, basta fazer:
	
	${foto.titulo}, ${foto.descricao}, ${foto.endereco} e assim por diante. 
--%>
<%@ attribute name="foto" required="true" type="br.com.caelum.caelumpic.modelo.Foto" %>
<div class="row">
	<div class="col s12 m6 l4">
		<div class="card sticky-action">
			<div class="card-image waves-effect waves-block waves-light">
				<img class="activator" src="${foto.endereco}">
			</div>
			<div class="card-content">
				<span class="card-title activator grey-text text-darken-4">
					${foto.titulo}
					<i class="material-icons right">more_vert</i>
				</span>
				<p>
					<%--
						Formatação da data de criação da foto no padrão dia/mês/ano.
						
						OBS.: Lembrar de declarar a taglig do JSTL no início do arquivo
						para utilização do fmt:formatDate.
					--%>
					<fmt:formatDate value="${foto.dataCriacao}" pattern="dd/MM/yyyy" />
				</p>
			</div>
			<div class="card-reveal">
				<span class="card-title grey-text text-darken-4">
					${foto.endereco}
					<i class="material-icons right">close</i>
				</span>
				<p>${foto.descricao}</p>
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