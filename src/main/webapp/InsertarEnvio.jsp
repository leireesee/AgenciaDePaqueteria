<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insertar Envio - SanchezExpress</title>
    <link rel="stylesheet" href="estilos.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body style="background-image: url(img/fondo-formulario.jpg); background-size: cover; background-repeat: no-repeat;">
    
   <br>
   <br>
   <br>

    <section style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
        <div style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px; background-color:white">
        	 <img alt="" src="img/logo.svg" width="200px" style="margin-left:25%;">
            <h2>Insertar Envio</h2>
            <c:if test="${MensajeError eq 'ERROR'}" >
          	<div class="alert alert-danger" role="alert">
  			Error, vuelva a intentarlo!
			</div>
     	   </c:if> 
          <br>
            <form method="post" action = "ControladorEnvioInsertar"  class="signin-form" style="width: 400px;">
                
                <label class="label" for="password">Tipo Envio</label>
                <select class="form-select" aria-label="Default select example" name="tipoEnvio">
                    <option value="Carta">Carta</option>
                    <option value="Paquete">Paquete</option>
                  </select>

                  <br>
                  
                    
                <div class="form-group mb-3">
                    <label class="label" for="name">Codigo Sucursal</label>
                    <input type="text" class="form-control" placeholder="Sucursal" required name="cod_sucursal">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Codigo Cliente </label>
                    <input type="text" class="form-control" placeholder="Cliente" required name="cod_cliente">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Fecha Entrada</label>
                    <input type="date" class="form-control" placeholder="Fecha Entrada" required name="fecha_entrada">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Fecha Salida</label>
                    <input type="date" class="form-control" placeholder="Fecha Salida" required name="fecha_salida">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Fecha Llegada</label>
                    <input type="date" class="form-control" placeholder="Fecha Llegada" required="" name="fecha_llegada">
                </div>
                
                 <label class="label" for="password">Entregado</label>
                <select class="form-select" aria-label="Default select example" name="entregado">
                    <option value="Si">Si</option>
                    <option value="No">No</option>
                  </select>
				
				<div class="form-group mb-3">
                    <label class="label" for="name">Direccion Destino</label>
                    <input type="text" class="form-control" placeholder="Tracking" required="" name="direccion_destino">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Tracking</label>
                    <input type="text" class="form-control" placeholder="Tracking" required="" name="tracking">
                </div>

                <br>
                <div class="form-group">
                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">Insertar</button>
                </div>
                <br>
            </form>
        </div>
    </section>

</body>
</html>