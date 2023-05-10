<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar Empleado - SanchezExpress</title>
  <link rel="stylesheet" href="estilos.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body style="background-image: url(img/fondo-formulario.jpg); background-size: cover; background-repeat: no-repeat;">
    
   <br>
   <br>
   <br>
	   <c:set var="empleado" value="${ requestScope.empleado }" />
	
    <section style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
        <div style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px;background-color:white">
        	 <img alt="" src="img/logo.svg" width="200px" style="margin-left:25%;">
        	<br>
            <h2>MODIFICAR EMPLEADO</h2>
            
              <c:if test="${MensajeError eq 'ERROR'}" >
          	<div class="alert alert-danger" role="alert">
  			Error, vuelva a intentarlo!
			</div>
          </c:if> 
            <br>
            <form method="post" action = "ControladorModificarEmpleado"  class="signin-form" style="width: 400px;">
                
                

                  
                  
                 <div class="form-group mb-3">
                    <label class="label" for="name">Codigo Sucursal</label>
                    <input type="text" class="form-control" placeholder="Codigo Sucursal" required name="cod_sucursal"  value="${empleado.sucursal.codSucursal}">
                </div>   
                    <input type="hidden" class="form-control" placeholder="DNI" required name="dni" readonly="readonly"  value="${empleado.dni}">

                <div class="form-group mb-3">
                    <label class="label" for="name">Nombre </label>
                    <input type="text" class="form-control" placeholder="Nombre" required name="nombre" value="${empleado.nombre}">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Direccion</label>
                    <input type="text" class="form-control" placeholder="Direccion" required name="direccion" value="${empleado.direccion}">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Telefono</label>
                    <input type="text" class="form-control" placeholder="Telefono" required name="telefono" value="${empleado.telefono}">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Numero de Seguirdad Social</label>
                    <input type="text" class="form-control" placeholder="NSS" required name="nss" value="${empleado.numSeguridadS}">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Categoria</label>
                    <input type="text" class="form-control" placeholder="Categoria" required name="categoria" value="${empleado.categoria}">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Nomina</label>
                    <input type="number" class="form-control" placeholder="Nomina" required name="nomina" value="${empleado.nomina}">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Comision</label>
                    <input type="number" class="form-control" placeholder="Comision" required name="comision" value="${empleado.comision}" >
                </div>
                
                 <div class="form-group mb-3">
                    <label class="label" for="name">Codigo departamento</label>
                    <input type="number" class="form-control" placeholder="Codigo Departamento" required name="cod_departamento" value="${empleado.departamento.codDepartamento}">
                </div>
                
                <div class="form-group mb-3">
                    <label class="label" for="name">Contraseña</label>
                    <input type="text" class="form-control" placeholder="Contraseña" required name="contrasena" value="${empleado.contrasena}">
                </div>

           

                <br>
                <div class="form-group">
                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">MODIFCAR</button>
                </div>
                <br>
            </form>
        </div>
    </section>

</body>
</html>