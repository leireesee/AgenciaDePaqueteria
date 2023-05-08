<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estilos/EstilosVistaEmpleados.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Ver Clientes - SanchezExpress</title>
</head>
<body>
    <section id="clientes">
    
    			<h1>VER CLIENTES</h1>
    			<h1><a hreft="ControladorVistaEmpleado">VOLVER</a></h1>
                <!--podemos poner para modificar o eliminar botones al lado de los envios-->
                <!---foreach ver CLIENTES-->
                <table class="table table-striped">
		
				<tr>
					<th>CODIGO CLIENTE</th>
					<th>DNI-CIF</th>
					<th>NOMBRE</th>
					<th>DIRECCION</th>
					<th>FORMA DE PAGO</th>
					<th>TELEFONO</th>
					<th>CONTRASEÑA </th>
				
					
					
					
				</tr>
		
			<c:forEach items="${clientes}" var="cliente">
		
				<tr>
					<th scope="row">${cliente.codCliente}</th>
					<th>${cliente.dniCif}</th>
					<th>${cliente.nombre}</th>	
					<th>${cliente.direccion}</th>	
					<th>${cliente.formaPago}</th>	
					<th>${cliente.telefono}</th>	
					<th>${cliente.contrasena}</th>	
					
					
									
					<th><button><a href=ControladorClienteEliminar?codCliente=${cliente.codCliente}>DAR DE BAJA </a></button></th>
					<th><button><a href=ControladorModificarCliente?codCliente=${cliente.codCliente}>MODIFICAR </a></button></th>
					 
					
				</tr>
			
			
			</c:forEach>
		
		</table>
            </section>
</body>
</html>