<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
</head>
<body>

	<section id="envios">
		<!--ver todos los envios hasta x linea-->
		<!--podemos poner para modificar o eliminar botones al lado de los envios-->
		<h2>VER ENVIOS</h2>
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

		<!---foreach ver envios-->
		<table class="table ">

			<br>
			<br>



			<tr>
				<th>CODIGO ENVIO <c:if test="${ordenar eq 'asc'}">
						<a class="ordenar" name="Ordenar" href="ControladorVerEnvios">
							<i class="fa-solid fa-sort-down" style="color: #1064f4;"></i>
						</a>
					</c:if> <c:if test="${ordenar ne 'asc'}">
						<a class="ordenar" name="Ordenar"
							href="ControladorVerEnvios?Ordenar=asc"> <i
							class="fa-solid fa-sort-up" style="color: #005cfa;"></i>
						</a>
					</c:if>
				</th>
				<th>CODIGO SUCURSAL</th>
				<th>CODIGO CLIENTE</th>
				<th>FECHA ENTRADA</th>
				<th>FECHA SALIDA</th>
				<th>FECHA LLEGADA</th>
				<th>ENTREGADO</th>
				<th>DIRECCION DESTINO</th>
				<th>TRACKING</th>




			</tr>

			<c:forEach items="${envios}" var="envio">

				<tr>
					<th scope="row">${envio.codEnvio}</th>
					<td>${envio.sucursal.codSucursal}</td>
					<td>${envio.cliente.codCliente}</td>
					<td>${envio.fechaEntrada}</td>
					<td>${envio.fechaSalida}</td>
					<td>${envio.fechaLlegada}</td>
					<td>${envio.entregado}</td>
					<td>${envio.direccionDestino}</td>
					<td>${envio.tracking}</td>

					<th><button type="button" class="btn btn-danger">
							<a href=ControladorEnvioEliminar?codEnvio=${envio.codEnvio}
								style="color: white !important">CANCELAR ENVIO </a>
						</button></th>
					<th><button type="button" class="btn btn-success">
							<a href=ControladorModificarEnvio?codEnvio=${envio.codEnvio}
								style="color: white !important">MODIFICAR </a>
						</button></th>
				</tr>


			</c:forEach>

		</table>
	</section>
</body>
</html>