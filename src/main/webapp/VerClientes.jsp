<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/1257316c57.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="estilos/EstiloVistaEmpleado.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Ver Clientes - SanchezExpress</title>
</head>
<body>
	<section id="clientes">

		<h1>VER CLIENTES</h1>
			<c:if test="${empleado.categoria eq 'Administrador'}">
		<button type="button" class="btn btn-primary">
			<a href="ControladorVistaAdmin" style="color: white">VOLVER</a>

		</button>
		
		</c:if>
		
		<c:if test="${empleado.categoria ne 'Administrador' }">
		<button type="button" class="btn btn-primary">
			<a href="ControladorVistaEmpleado" style="color: white">VOLVER</a>

		</button>
		</c:if>
		<!--podemos poner para modificar o eliminar botones al lado de los envios-->
		<!---foreach ver CLIENTES-->
		<table class="table">

			<tr>
				<th>CODIGO CLIENTE</th>
				<th>DNI-CIF</th>
				<th>NOMBRE</th>
				<th>DIRECCION</th>
				<th>FORMA DE PAGO</th>
				<th>TELEFONO</th>
				<th>CONTRASEÑA</th>




			</tr>

			<c:forEach items="${clientes}" var="cliente">

				<tr>
					<th scope="row">${cliente.codCliente}</th>
					<td>${cliente.dniCif}</td>
					<td>${cliente.nombre}</td>
					<td>${cliente.direccion}</td>
					<td>${cliente.formaPago}</td>
					<td>${cliente.telefono}</td>
					<td>${cliente.contrasena}</td>



					<th><button type="button" class="btn btn-danger">
							<a
								href=ControladorClienteEliminar?codCliente=${cliente.codCliente}
								style="color: white !important">DAR DE BAJA </a>
						</button></th>
					<th><button type="button" class="btn btn-success">
							<a
								href=ControladorModificarCliente?codCliente=${cliente.codCliente}
								style="color: white !important">MODIFICAR </a>
						</button></th>


				</tr>


			</c:forEach>

		</table>
	</section>
</body>
</html>