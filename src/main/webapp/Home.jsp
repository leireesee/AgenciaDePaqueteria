<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="estilos.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
    <!---AÑADIR UN FAVICON--->

    <title>Home  - SanchezExpress</title>
</head>

<body>

    <section id="menu">
        <nav class="navbar navbar-expand-lg shadow p-3 mb-5">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><img
                        src=""
                        alt="" width="220px"></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
                    aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarScroll">
                    <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                                aria-expanded="false">
                                Recibir
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Localiza tu envío</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="#">Nuestras sucursales</a></li>
                                <li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                                aria-expanded="false">
                                Enviar
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Envíos locales</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="#">Envíos al extrangero</a></li>
                                <li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Empresa</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Ayuda</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contacta</a>
                        </li>
                        
                        <c:if test="${sessionScope.cliente.codCliente!=null}">
                        	 <li style="margin-left: 100px;">
	                            <div style="background-color: #dfa800; padding: 7px; border-radius: 5px; color: white;">
	                            	Bienvenid@, ${sessionScope.cliente.nombre}!
	                            </div>
	                        </li>
                        </c:if>
                        
                        <c:if test="${sessionScope.cliente.codCliente==null}">
	                        <li style="margin-left: 100px;">
	                            <div style="background-color: #dfa800; padding: 7px; border-radius: 5px; color: white;">
	                            	<a href='ControladorLoginInicioS'>
	                                	<i class="fa-solid fa-user" style="color: #FFFFFF"></i>
	                                	Iniciar Sesión
	                                </a>
	                            </div>
	                        </li>
	                        <li style="margin-left: 10px;">
	                            <div style="background-color: #004E86; padding: 7px; border-radius: 5px; color: white;">
	                            	<a href="ControladorRegistrarse">
	                                	<i class="fa-solid fa-user-plus" style="color: #FFFFFF;"></i>   Registrarse
	                            	</a>
	                            </div>
	                        </li>
                        </c:if>
                    </ul>
                </div>
            </div>
        </nav>
    </section>
    
    <header>
        <div class="texto-header">
            <h1><span>Rápidos y  Confiables</span></h1>

            <p class="info">Envía y recibe envíos en tan solo 5 minutos a cualquier parte del mundo.</p>
        </div>

        <div class="imagen-header">
            <!---<p><img src="img/img1.svg" alt="" width="500px"></p>--->
            <p><img src="img/Global logistics delivery network.svg" alt="" width="500px"></p>
        </div>
        
    </header>


 
   <section id="cards">
        <div class="cards-display">
            <div class="card" style="width: 25rem;">
                <div class="card-body">
                  <h5 class="card-title">¿Quieres realizar un envío?</h5>
                  
                  <p class="card-text">Para realizar un envío tan solo necesitas DNI y seleccionar tu tarifa adecuada a tus necesidades.</p>
                  <a href="#" class="card-link">Consultar tarifas ></a>
                </div>
              </div>
              <div class="card" style="width: 25rem;">
                <div class="card-body">
                  <h5 class="card-title">¿Dónde está mi envío?</h5>
                  
                  <p class="card-text">Podrás ver en todo momento donde se encuentra tu envío gracias a nuestro tracking.</p>
                  <a href="#" class="card-link">Localiza tu envío ></a>
                </div>
              </div>
              <div class="card" style="width: 25rem;">
                <div class="card-body">
                  <h5 class="card-title">¿Cómo recibir un envío?</h5>
                  
                  <p class="card-text">Para recoger un envío debes de ser la persona remitente y  presentar el DNI.</p>
                  <a href="#" class="card-link">Tarifas de cobro a destinatario ></a>
                </div>
              </div>
        </div>
    </section>

    <section id="ventajas">
        <article class="ventajas-texto">
            <h2>Ventajas de <img src="" alt="" width="200px"></h2>
            <br>
            <ul>
                <li>
                    <article>
                        <i class="fa-regular fa-clock fa-2xl" style="color: #005eff;"></i>
                    </article>
                    <article>
                       <h6>Ahorra Tiempo</h6>
                       <p>Con la ayuda de nuestro servicio express, cuidarás de ti o de tu negocio.</p> 
                    </article>
                </li>

                <li>
                    <article>
                        <i class="fa-solid fa-circle-check fa-2xl" style="color: #004bcc;"></i>
                    </article>
                    <article>
                       <h6>100% Confiable</h6>
                       <p>Nuestro sistema de tracking te permitirá saber donde se encuentra tu paquete en todo momento.</p> 
                    </article>
                </li>
                <li>
                    <article>
                        <i class="fa-solid fa-headset fa-2xl" style="color: #0050db;"></i>
                    </article>
                    <article>
                       <h6>Estamos Aquí Para Ti</h6>
                       <p>Contamos con una atención al cliente que se adapta a tus necesidades y resuelve cualquier problema que puedas encontrar.</p> 
                    </article>
                </li>
                <li>
                    <article>
                        <i class="fa-solid fa-earth-europe fa-2xl" style="color: #0040ad;"></i>
                    </article>
                    <article>
                       <h6>Envíos a cualquier parte del mundo</h6>
                       <p>Contamos con envíos internacionales que te permitirán enviar por todo el mundo.</p> 
                    </article>
                </li>
            </ul>
        </article>

        <article>
            <img src="img/img1.svg" width="500px" alt="">
        </article>
        
    </section>

    <footer>
        <div class="row">
            <div class="col-12 col-md-4">
                <ul>
                    <li><h2>Contacto</h2></li>
                    <li><p>918 31 19 12</p></li>
                    <li><p>ayuda@sanchezexpress.es</p></li>
                    <li><p><strong><a href="#">Formulario de contacto > </a></strong></p></li>
                    <li><p><strong><a href="#">Sobre nuestra empresa > </a></strong></p></li>
                </ul>
            </div>

            <div class="col-12 col-md-4">
                <ul>
                    <li><h2>Más información</h2></li>
                    <li><p><strong><a href="#">Preguntas frecuentes > </a></strong></p></li>
                    <li><p><strong><a href="#">Tarifas de envíos > </a></strong></p></li>
                    <li><p><strong><a href="#">Métodos de pago > </a></strong></p></li>
                    <li><p><strong><a href="#">Encuéntranos > </a></strong></p></li>
                </ul>
            </div>

            <div class="col-12 col-md-4">
                <ul>
                    <li><h2>Redes sociales</h2></li>
                    <li>
                        <div class="row">
                            <div class="col">
                                <a href="https://www.instagram.com/kobold_es/">
                                    <i class="fa-brands fa-instagram fa-2xl" style="color: #ffffff;"></i>
                                </a>
                            </div>
                            <div class="col">
                                <a href="https://www.facebook.com/KoboldES/">
                                    <i class="fa-brands fa-facebook fa-2xl" style="color: #ffffff;"></i>
                                </a>
                            </div>
                            <div class="col">
                                <a href="https://www.youtube.com/user/KoboldVorwerkSpain">
                                    <i class="fa-brands fa-youtube fa-2xl" style="color: #ffffff;"></i>
                                </a>
                            </div>
                        </div>

                        <br>
                        <br>

                        <div class="row">
                            <div class="col-12">
                                <img src="" alt="" width="200px">
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </footer>

</body>
</html>