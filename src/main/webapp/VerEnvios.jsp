<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="estilos/EstilosVistaEmpleados.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

            <section id="envios"> <!--ver todos los envios hasta x linea-->
                <!--podemos poner para modificar o eliminar botones al lado de los envios-->
                <h2>VER ENVIOS</h2>
                <!---foreach ver envios-->
                <table class="table table-striped">
		
				<tr>
					<th>CODIGO ENVIO</th>
					<th>CODIGO SUCURSAL</th>
					<th>CODIGO CLIENTE</th>
					<th>FECHA ENTRADA</th>
					<th>FECHA SALIDA</th>
					<th>FECHA LLEGADA</th>
					<th>ENTREGADO </th>
					<th>DIRECCION DESTINO </th>
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
					
					<th><button><a href=ControladorEnvioEliminar?codEnvio=${envio.codEnvio}>CANCELAR ENVIO </a></button></th>
					<th><button><a href=ControladorModificarCliente?codCliente=${cliente.codCliente}>MODIFICAR </a></button></th>
				</tr>
			
			
			</c:forEach>
		
		</table>
            </section>
</body>
</html>