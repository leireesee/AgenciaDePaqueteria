<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="estilos.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body
	style="background-image: url(img/fondo-formulario.jpg); background-size: cover; background-repeat: no-repeat;">

	<c:set var="cliente" value="${ requestScope.cliente }" />
	<!-- formulario modificar cliente-->

	<section
		style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 100vh;">
		<div
			style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px; background-color: white">
			<img alt="" src="img/logo.svg" width="200px"
				style="margin-left: 25%;"> <br>
			<h2>MODIFICAR CLIENTE</h2>
			<c:if test="${MensajeError eq 'ERROR'}">
				<div class="alert alert-danger" role="alert">Error, vuelva a
					intentarlo!</div>
			</c:if>
			<br>
			<form method="post" action="ControladorModificarCliente"
				class="signin-form" style="width: 400px;">

				<input type="hidden" class="form-control" placeholder="DNI / CIF"
					required="" name="codCliente" value="${cliente.codCliente}">

				<div class="form-group mb-3">
					<label class="label" for="name">DNI / CIF</label> <input
						type="text" class="form-control" placeholder="DNI / CIF"
						required="" name="dniCif" value="${cliente.dniCif}">

				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Nombre</label> <input type="name"
						class="form-control" placeholder="Nombre" required=""
						name="nombre" value="${cliente.nombre}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Telefono</label> <input type="text"
						class="form-control" placeholder="Teléfono" required=""
						name="telefono" value="${cliente.telefono}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Direccion</label> <input
						type="text" class="form-control" placeholder="Direccion"
						required="" name="direccion" value="${cliente.direccion}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="password">Contraseña</label> <input
						type="password" class="form-control" placeholder="Contraseña"
						required="" name="contrasena" value="${cliente.contrasena}">
				</div>


				<div class="form-group">
					<button type="submit"
						class="form-control btn btn-primary rounded submit px-3">Modificar</button>
				</div>
				<br>
			</form>
			<br>
		</div>
	</section>

</body>
</html>