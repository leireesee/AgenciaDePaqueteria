<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<link rel="stylesheet" href="estilos/EstiloVistaEmpleado.css">

<title>Vista Cliente -- SanchezExpress</title>

</head>

<body>



	<section class="menu-cliente">





		<div
			style="display: flex; justify-content: flex-end; align-items: center; flex-wrap: wrap; gap: 13px">

			<a href="ControladorHome"><button type="button"
					class="btn btn-outline-primary"><</button></a>


			<nav class="navbar navbar-expand-lg navbar-light bg-light">

				<div class="navegador container-fluid">

					<c:if test="${sessionScope.cliente.dniCif!=null}">
						<li style="margin-left: 100px;">
							<div>Bienvenid@, ${sessionScope.cliente.nombre}!</div>
						</li>
					</c:if>

					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown"
						aria-controls="navbarNavDarkDropdown" aria-expanded="false"
						aria-label="Toggle navigation">

						<span class="navbar-toggler-icon"></span>

					</button>

					<div class="collapse navbar-collapse" id="navbarNavDarkDropdown">

						<ul class="navbar-nav">

							<li class="nav-item dropdown">

								<button class="btn btn-light dropdown-toggle"
									data-bs-toggle="dropdown" aria-expanded="false">

									<i class="fa-solid fa-user" style="color: #4979ff;"></i>



								</button>

								<ul class="dropdown-menu dropdown-menu-light">

									<li><a class="dropdown-item"
										href="ControladorCerrarSesion">Cerrar Sesión</a></li>

									<li><a class="dropdown-item" href="#">Ajustes</a></li>

								</ul>

							</li>

						</ul>

					</div>

				</div>

			</nav>



		</div>



		<div class="iconos-menu-cliente">

			<ul>

				<li><a href=""> <i class="fa-regular fa-bell fa-xl"
						style="color: #4979ff;"></i>

				</a></li>



				<li><a href=""> <i
						class="fa-solid fa-right-from-bracket fa-xl"
						style="color: #4979ff;"></i>

				</a></li>



			</ul>

		</div>
	</section>



	<section class="envios-cliente">

		<!---foreach ver envios-->
		<table class="table ">

			<tr>
				<th>CODIGO ENVIO</th>
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

				</tr>


			</c:forEach>

		</table>

	</section>







</body>

</html>