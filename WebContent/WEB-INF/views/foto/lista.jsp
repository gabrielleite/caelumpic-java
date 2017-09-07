<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="caelum" tagdir="/WEB-INF/tags" %>
<caelum:template>
	<jsp:body>
		<%--
			${fotos} eh referente a lista de fotos que foi passada para essa JSP
			atraves do metodo lista da classe FotoController.
			
			OBS.: Lembrar de declarar a taglig do JSTL no inicio do arquivo para
			utilizacao do c:forEach.
		--%>
		<div class="row">
			<c:forEach items="${fotos}" var="foto">
				<caelum:fotoCartao foto="${foto}"/>
			</c:forEach>
		</div>
		
		<caelum:fab link="formulario" icone="add_a_photo" />
	</jsp:body>
</caelum:template>