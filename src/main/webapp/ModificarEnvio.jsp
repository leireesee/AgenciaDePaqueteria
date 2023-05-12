<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar Empleado - SanchezExpress</title>
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

	<br>
	<br>
	<br>
	<c:set var="empleado" value="${ requestScope.envio }" />
	<!-- formulario modificar envio-->

	<section
		style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
		<div
			style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px; background-color: white">
			<img alt="" src="img/logo.svg" width="200px"
				style="margin-left: 25%;"> <br>
			<h2>MODIFICAR EMPLEADO</h2>

			<c:if test="${MensajeError eq 'ERROR'}">
				<div class="alert alert-danger" role="alert">Error, vuelva a
					intentarlo!</div>
			</c:if>
			<br>
			<form method="post" action="ControladorModificarEnvio"
				class="signin-form" style="width: 400px;">

				<label class="label" for="password">Tipo Envio</label> <select
					class="form-select" aria-label="Default select example"
					name="tipoEnvio">
					<option value="Carta">Carta</option>
					<option value="Paquete">Paquete</option>
				</select> <br> <input type="hidden" class="form-control"
					placeholder="Sucursal" name="codEnvio" value="${envio.codEnvio}">

				<div class="form-group mb-3">
					<label class="label" for="name">Codigo Sucursal</label> <input
						type="text" class="form-control" placeholder="Sucursal" required
						name="cod_sucursal" value="${envio.sucursal.codSucursal}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Codigo Cliente </label> <input
						type="text" class="form-control" placeholder="Cliente" required
						name="cod_cliente" value="${envio.cliente.codCliente}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Fecha Entrada</label> <input
						type="date" class="form-control" placeholder="Fecha Entrada"
						required name="fecha_entrada" value="${envio.fechaEntrada}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Fecha Salida</label> <input
						type="date" class="form-control" placeholder="Fecha Salida"
						required name="fecha_salida" value="${envio.fechaSalida}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Fecha Llegada</label> <input
						type="date" class="form-control" placeholder="Fecha Llegada"
						required="" name="fecha_llegada" value="${envio.fechaLlegada}">
				</div>

				<label class="label" for="password">Entregado</label> <select
					class="form-select" aria-label="Default select example"
					name="entregado" value="${envio.entregado}">
					<option value="Si">Si</option>
					<option value="No">No</option>
				</select>

				<div class="form-group mb-3">
					<label class="label" for="name">Direccion Destino</label> <input
						type="text" class="form-control" placeholder="Tracking"
						required="" name="direccion_destino"
						value="${envio.direccionDestino}">
				</div>

				<div class="form-group mb-3">
					<label class="label" for="name">Tracking</label> <input type="text"
						class="form-control" placeholder="Tracking" required=""
						name="tracking" value="${envio.tracking}">
				</div>

				<br>
				<div class="form-group">
					<button type="submit"
						class="form-control btn btn-primary rounded submit px-3">MODIFICAR</button>
				</div>
				<br>







			</form>
		</div>
	</section>

</body>
</html>