
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estilos/estilosContacta.css">
    <title>Contacta</title>
</head>
<body>

    <!--NAVEGADOR-->
    <section id="menu">

        <nav class="navbar navbar-expand-lg p-3 mb-5">
       
        <div class="container-fluid">
       
        <a class="navbar-brand" href="#"><img
       
        src="img/logo-sobre-azul.svg"
       
        alt="" width="270px"></a>
       
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
       
        aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
       
        <span class="navbar-toggler-icon"></span>
       
        </button>
       
        <div class="collapse navbar-collapse" id="navbarScroll" style="margin-left: 30px">
       
        <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
       
        <li class="nav-item dropdown">
       
        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
       
        aria-expanded="false">
       
        Recibir
       
        </a>
       
        <ul class="dropdown-menu">
       
        <li><a class="dropdown-item" href="ControladorLoginInicioS">Localiza tu envío</a></li>
       
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
       
        <li><a class="dropdown-item" href="#">Envíos al extranjero</a></li>
       
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
       
        
       
        </ul>
       
        <ul style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap">
       
        
       
        <c:if test="${sessionScope.cliente.codCliente!=null}">
       
        <li style="margin-left: 100px;">
       
           <div style="background-color: #dfa800; padding: 7px; border-radius: 5px; color: white;">
       
           Bienvenid@, ${sessionScope.cliente.nombre}!
       
           </div>
       
           </li>
       
        </c:if>
       
        
       
        <c:if test="${sessionScope.cliente.codCliente==null}">
       
           <li style="list-style-type: none">
       
           <a href='ControladorLoginInicioS' style="color: white; text-decoration: none;">
       
           <button type="button" class="btn btn-outline-light"><i class="fa-solid fa-user" style="color: #FFFFFF; margin-right: 5px"></i> Iniciar Sesión</button>
       
           </a>
       
           </li>
       
           <li style="margin-left: 10px; list-style-type: none">
       
           <a href="ControladorRegistrarse">
       
           <button type="button" class="btn btn-outline-light"><i class="fa-solid fa-user-plus" style="color: #FFFFFF; margin-right: 5px"></i> Registrarse</button>
       
           </a>
       
           </li>
       
        </c:if>
       
        </ul>
       
        </div>
       
        </div>
       
        </nav>
       
        </section>
       
        
       
        <header style="background-image: url(img/fondo3.jpg); background-size: cover; background-position: bottom; height: 400px;">
       
        </div>
       
        </header>
       
       
       
       
       


    <!--FORMULARIO-->
    <div class="posicion-formulario">
        <section class="seccion-formulario">
            <div>
                <div class="row">
                    <div class="col-12 col-md-6">
                        <h2>Contacta</h2>
                                
                        <div class="row">
                            <div class="col-12 col-md-6">
                                <div class="mb-3">
                                    <label for="exampleFormControlInput1" class="form-label">Nombre</label>
                                    <input type="name" class="form-control" id="exampleFormControlInput1" placeholder="Nombre">
                                </div> 
                            </div>
                            <div class="col-12 col-md-6">
                                <div class="mb-3">
                                    <label for="exampleFormControlInput1" class="form-label">Email</label>
                                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="nombre@ejemplo.com">
                                </div>
                            </div>
                        </div>
        
                        <div class="row">
                            <div class="col-12">
                                <div class="mb-3">
                                    <label for="exampleFormControlTextarea1" class="form-label">Texto</label>
                                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                                </div>
                            </div>
                        </div>
        
                        <div class="row" style="padding-left: 10px; padding-right: 10px;">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
        
                    </div>
        
        
                    <div class="segunda-columna col-12 col-md-6">
                        <div>
                            <div style="margin-bottom: 20px;">
                                <div class="texto-icono">
                                    <i class="fa-solid fa-phone-volume fa-lg" style="color: #0026ff;"></i>
                                    <p>943 89 92 14</p>
                                </div>
                                
                            </div>
            
                            <div style="margin-bottom: 40px;">
                                <div class="texto-icono">
                                    <i class="fa-solid fa-location-dot fa-lg" style="color: #0026ff;"></i>
                                <p>Plaiaundi, s/n, 20301 Irun, Gipuzkoa</p>
                                </div>
                                
                            </div>

                            <div>
                                <p>Enviando un mensaje obtendrás respuesta casi inmediata en un rango menor a 24h desde el envío del mensaje.</p>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </section>
    </div>
    



    <!--MAPA-->

    <section class="seccion-mapa">
        <div>
            <h2 class="h2-sucursal-cercana">Tu sucursal mas cercana</h2>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2901.493067978924!2d-1.7999994230496092!3d43.34579587111836!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd5108574109200f%3A0x76e7a4caa007390f!2sIES%20Plaiaundi%20BHI!5e0!3m2!1ses!2ses!4v1683640712888!5m2!1ses!2ses" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>
    </section>

    <!--PREGUNTAS FRECUENTES-->
    <h2 style="text-align: center;">Preguntas frecuentes</h2>
    <br>
    <br>
    <section class="seccion-preguntas">
        <div class="row">
            <div class="col-10 col-md-8 col-lg-6">
                
                <div class="posicion-condicion">
                    <div class="accordion accordion-flush" id="accordionFlushExample">
                        <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-headingOne">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                            ¿Cómo puedo realizar un envío?
                            </button>
                        </h2>
                        <div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                            <div class="accordion-body">Para realizar un envío tienes que acercarte a la sucursal más cercana con los datos del destinatario.</div>
                        </div>
                        </div>
                        <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-headingTwo">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                            ¿Cuáles son los datos del destinatario?
                            </button>
                        </h2>
                        <div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
                            <div class="accordion-body">Para realizar un envío de forma correcta, necesitaremos el dni y la dirección del destinatario.</div>
                        </div>
                        </div>
                        <div class="accordion-item">
                        <h2 class="accordion-header" id="flush-headingThree">
                            <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
                            ¿Cuánto tarda en llegar mi envío?
                            </button>
                        </h2>
                        <div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
                            <div class="accordion-body">Dependiendo de la distancia, tardamos entre 24 y 72 horas. Puedes obtener más detalles de tu envío iniciando sesión <a href="ControladorLoginInicioS">aquí.</a></div>
                        </div>
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
        
    </section>

    <br>
    <br>
    <br>
    <br>
    <br>
    
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
   
    <li><p><strong><a href="ControladorLoginEmpleados">Sección empleados > </a></strong></p></li>
   
    </ul>
   
    </div>
   
   
   
    <div class="col-12 col-md-4">
   
    <ul>
   
    <li><h2>Redes sociales</h2></li>
   
    <li>
   
    <div class="row">
   
    <div class="col">
   
    <a href="https://www.instagram.com/kobold_es/">
   
    <i class="fa-brands fa-instagram fa-xl" style="color: #ffffff;"></i>
   
    </a>
   
    </div>
   
    <div class="col">
   
    <a href="https://www.facebook.com/KoboldES/">
   
    <i class="fa-brands fa-facebook fa-xl" style="color: #ffffff;"></i>
   
    </a>
   
    </div>
   
    <div class="col">
   
    <a href="https://www.youtube.com/user/KoboldVorwerkSpain">
   
    <i class="fa-brands fa-youtube fa-xl" style="color: #ffffff;"></i>
   
    </a>
   
    </div>
   
    <div class="col">
   
    <a href="https://www.youtube.com/user/KoboldVorwerkSpain">
   
    <i class="fa-brands fa-twitter fa-xl" style="color: #ffffff;"></i>
   
    </a>
   
    </div>
   
    <div class="col">
   
    <a href="https://www.youtube.com/user/KoboldVorwerkSpain">
   
    <i class="fa-brands fa-linkedin fa-xl" style="color: #ffffff;"></i>
   
    </a>
   
    </div>
   
    </div>
   
   
   
    <br>
   
    <br>
   
   
   
    <div class="row">
   
    <div class="col-12">
   
    <img src="img/logo-blanco.svg" alt="" width="250px">
   
    </div>
   
    </div>
   
    </li>
   
    </ul>
   
    </div>
   
    </div>
   
    </footer>

    
</body>
</html>
