<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="caelum" tagdir="/WEB-INF/tags" %>
<caelum:template>
	<jsp:body>
		<%--
			${fotos} � referente � lista de fotos que foi passada para essa JSP
			atrav�s do m�todo lista da classe FotoController.
			
			OBS.: Lembrar de declarar a taglig do JSTL no in�cio do arquivo para
			utiliza�ao do c:forEach.
		--%>
		<c:forEach items="${fotos}" var="foto">
			<caelum:fotoCartao foto="${foto}"/>
		</c:forEach>
	</jsp:body>
</caelum:template>