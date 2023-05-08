<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrarse - SanchezExpress</title>
    <link rel="stylesheet" href="estilos.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    
   

    <section style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 100vh;">
        <div style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px;">
            <h2>Registrarse</h2>
            <br>
            <form method="post" action = "ControladorRegistrarse" class="signin-form" style="width: 400px;">
                
                <div class="form-group mb-3">
                    <label class="label" for="name">DNI / CIF</label>
                    <input type="text" class="form-control" placeholder="DNI / CIF" required="" name="dniCif">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name" >Nombre</label>
                    <input type="name" class="form-control" placeholder="Nombre" required="" name="nombre">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Telefono</label>
                    <input type="text" class="form-control" placeholder="Tel�fono" required="" name="telefono">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Direccion</label>
                    <input type="text" class="form-control" placeholder="Direccion" required="" name="direccion">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="password">Contrase�a</label>
                    <input type="password" class="form-control" placeholder="Contrase�a" required="" name="contrasena">
                </div>


                <div class="form-group">
                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">Registrarse</button>
                </div>
                <br>
            </form>
            <br>
            <p class="text-center">Ya tienes una cuenta? <a data-toggle="tab" href="ControladorLoginInicioS">Iniciar Sesi�n</a></p>
        </div>
    </section>

</body>
</html>