<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css " />
</head>
<body>

<table>
	<tr>
	<th>Nombre</th>
	<th>Apellidos</th>
	<th>Email</th>
	
	<th>Modificar</th>
	</tr>
	
	<c:forEach var="clientTemp" items="${clientes }">
		
		<c:url var="linkActualizar" value="/cliente/muestraFormularioActualizar">
			<c:param name="clienteId" value="${clientTemp.id}"></c:param>
		</c:url>
		
		<c:url var="linkEliminar" value="/cliente/eliminar">
			<c:param name="clienteId" value="${clientTemp.id}"></c:param>
		</c:url>
		
		<tr>
			<td>${clientTemp.nombre}</td>
			<td>${clientTemp.apellido}</td>
			<td>${clientTemp.email}</td>
			<td><a href="${linkActualizar}"><input type="button" value="Modificar"></a></td>
			<td><a href="${linkEliminar}"><input type="button" value="Eliminar"
			onclick="if(!(confirm('Vas a elimar el registro Quieres hacerlo?'))) return false"></a></td>
		</tr>
	</c:forEach> 
	

</table>
<br>
<input type="button" value="Agregar Cliente" onclick="window.location.href='muestraFormularioAgregar';return false;">
</body>
</html>