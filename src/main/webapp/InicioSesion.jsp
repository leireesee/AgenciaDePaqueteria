<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="estilos.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
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
                        <li style="margin-left: 100px;">
                            <div style="background-color: #dfa800; padding: 7px; border-radius: 5px; color: white;">
                                <i class="fa-solid fa-user" style="color: #FFFFFF"></i>
                                Iniciar Sesión
                            </div>
                        </li>
                        <li style="margin-left: 10px;">
                            <div style="background-color: #004E86; padding: 7px; border-radius: 5px; color: white;">
                                <i class="fa-solid fa-user-plus" style="color: #FFFFFF;"></i>   Registrarse </li>
                            </div>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>
    </section>

    <section style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
        <div style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px;">
            <h2>Log In</h2>
            <br>
            <form method="post" action = "ControladorLoginInicioS"  class="signin-form" style="width: 400px ;">
                
                <div class="form-group mb-3">
                    <label class="label" for="name">DNI / CIF</label>
                    <input type="text" class="form-control" placeholder="DNI / CIF" required="" name="codCliente">
                </div>
                <div class="form-group mb-3">
                    <label class="label" for="password">CONTRASEÑA</label>
                    <input type="password" class="form-control" placeholder="Contraseña" required="" name="contrasena">
                </div>


                <div class="form-group">
                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">Log In</button>
                </div>
                <br>
                
                  
                
            </form>
            <br>
            <p class="text-center">No tienes una cuenta? <a data-toggle="tab" href="ControladorRegistrarse">Registrate</a></p>
        </div>
    </section>

</body>
</html>