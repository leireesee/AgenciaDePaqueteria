<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Inicio de Sesion - SanchezExpress</title>
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

	<!-- INICIO SESION FORMULARIO -->
	<section
		style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
		<div
			style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px; background-color: white">
			<img alt="" src="img/logo.svg" width="200px"
				style="margin-left: 25%;"> <br>
			<h2>Log In Cliente</h2>
			<br>

			<form method="post" action="ControladorLoginInicioS"
				class="signin-form" style="width: 400px;">

				<div class="form-group mb-3">
					<label class="label" for="name">DNI / CIF</label> <input
						type="text" class="form-control" placeholder="DNI / CIF"
						required="" name="dniCif">
				</div>
				<div class="form-group mb-3">
					<label class="label" for="password">CONTRASEÑA</label> <input
						type="password" class="form-control" placeholder="Contraseña"
						required="" name="contrasena">
				</div>


				<div class="form-group">
					<button type="submit"
						class="form-control btn btn-primary rounded submit px-3">Log
						In</button>
				</div>
				<br>



			</form>
			<br>
			<p class="text-center">
				No tienes una cuenta? <a data-toggle="tab"
					href="ControladorRegistrarse">Registrate</a>
			</p>
		</div>
	</section>

</body>
</html>