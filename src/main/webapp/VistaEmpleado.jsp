<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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



<link rel="stylesheet" href="estilos/EstiloVistaEmpleado.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<title>Vista Empleado</title>

</head>

<body>



	<div class="row">

		<div class="col-12 col-md-9">

			<section class="bienvenido row">

				<div class="col-12">



					<nav class="navbar navbar-expand-lg navbar-light bg-light">

						<div class="navegador container-fluid">

							<c:if test="${sessionScope.empleado.dni!=null}">
								<li style="margin-left: 100px;">
									<div>Bienvenid@, ${sessionScope.empleado.nombre}!</div>
								</li>
							</c:if>

							<button class="navbar-toggler" type="button"
								data-bs-toggle="collapse"
								data-bs-target="#navbarNavDarkDropdown"
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

			</section>


			<section id="funciones">

				<h2>Opciones</h2>


				<div class="grupo-cuadrado">






					<a href="ControladorRegistrarse">

						<div class="cuadrado col-2 col-md-3">

							<i class="fa-solid fa-person-circle-plus fa-2xl"
								style="color: #FFFF;"></i> <br> <br>

							<h6>Insertar cliente</h6>

						</div>

					</a> <a href="ControladorVerClientes">

						<div class="cuadrado col-2 col-md-3">

							<i class="fa-solid fa-user-group fa-2xl" style="color: #ffffff;"></i>

							<br> <br>

							<h6>Ver clientes</h6>

						</div>

					</a> <a href="ControladorEnvioInsertar">

						<div class="cuadrado col-2 col-md-3">

							<i class="fa-solid fa-boxes-packing fa-2xl" style="color: #FFFF;"></i>

							<br> <br>

							<h6>Insertar envío</h6>

						</div>

					</a> <a href="ControladorVerEnvios">

						<div class="cuadrado col-2 col-md-3">

							<i class="fa-regular fa-eye fa-2xl" style="color: #ffffff;"></i>

							<br> <br>

							<h6>Ver envíos</h6>


						</div>

					</a>


				</div>


			</section>



			<br>


			<section id="envios">
				<!--ver todos los envios hasta x linea-->

				<!--podemos poner para modificar o eliminar botones al lado de los envios-->

				<h2>Últimos envíos</h2>

				<!---foreach ver empleados-->

				<table class="table">



					<tr style="background-color: #eff0f5">

						<th>CODIGO ENVIO</th>

						<th>CODIGO CLIENTE</th>

						<th>FECHA ENTRADA</th>

						<th>DIRECCION DESTINO</th>





					</tr>





					<c:set var="envios" value="${requestScope.envios}" />



					<c:forEach var="i" begin="0" end="10">



						<tr>

							<th scope="row">${envios.get(i).codEnvio}</th>

							<td>${envios.get(i).cliente.codCliente}</td>

							<td>${envios.get(i).fechaEntrada}</td>

							<td>${envios.get(i).direccionDestino}</td>





							<!--                

                   <th><button><a href=ControladorUsuarioEliminar?id=${usuario.id}>ELIMINAR UN USUARIO</a></button></th>

                   <th><button><a href=ControladorModificar?id=${usuario.id}>MODIFICAR UN USUARIO</a></button></th>

                    -->



						</tr>





					</c:forEach>



				</table>

			</section>

		</div>


		<div class="calendario col-12 col-md-3">

			<div class="month">

				<ul>

					<li>Mayo<br> <span style="font-size: 18px">2023</span></li>

				</ul>

			</div>


			<ul class="weekdays">

				<li>L</li>

				<li>M</li>

				<li>X</li>

				<li>J</li>

				<li>V</li>

				<li>S</li>


			</ul>


			<ul class="days">

				<li>1</li>

				<li>2</li>

				<li>3</li>

				<li>4</li>

				<li>5</li>

				<li>6</li>

				<li>7</li>

				<li>8</li>

				<li>9</li>

				<li><span class="active">10</span></li>

				<li>11</li>

				<li>12</li>

				<li>13</li>

				<li>14</li>

				<li>15</li>

				<li>16</li>

				<li>17</li>

				<li>18</li>

				<li>19</li>

				<li>20</li>

				<li>21</li>

				<li>22</li>

				<li>23</li>

				<li>24</li>

				<li>25</li>

				<li>26</li>

				<li>27</li>

				<li>28</li>

				<li>29</li>

				<li>30</li>

			</ul>

			<br> <br>

			<div class="actividades">

				<h3>Actividades</h3>

				<br>

				<div class="grupo_actividades">



					<div class="actividad">

						<h4>Reunión semanal</h4>

						<p>09 Mayo - 20:30</p>

					</div>



					<br>



					<div class="actividad">

						<h4>Llamada semanal</h4>

						<p>07 Mayo - 09:30</p>

					</div>





				</div>



			</div>

		</div>



	</div>





</body>

</html>