<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="caelum" tagdir="/WEB-INF/tags" %>
<caelum:template>
	<jsp:body>
		<%--
			${fotos} é referente à lista de fotos que foi passada para essa JSP
			através do método lista da classe FotoController.
			
			OBS.: Lembrar de declarar a taglig do JSTL no início do arquivo para
			utilizaçao do c:forEach.
		--%>
		<c:forEach items="${fotos}" var="foto">
			<caelum:fotoCartao foto="${foto}"/>
		</c:forEach>
	</jsp:body>
</caelum:template>