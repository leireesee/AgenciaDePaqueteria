<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Departamentos - SanchezExpress</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="estilos/EstiloVistaEmpleado.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

            <section id="envios"> <!--ver todos los envios hasta x linea-->
                <!--podemos poner para modificar o eliminar botones al lado de los envios-->
                <h2>VER DEPARTAMENTOS</h2>
                <button  type="button" class="btn btn-primary"><a href="ControladorVistaAdmin" style="color: white">VOLVER</a></h1></button>
                
                <!---foreach ver envios-->
                <table class="table ">
		
				<tr>
					<th>CODIGO DEPARTAMENTO</th>
					<th>NOMBRE  </th>
					
					
					
					
				</tr>
		
			<c:forEach items="${departamentos}" var="departamento">
		
				<tr>
					<th scope="row">${departamento.codDepartamento}</th>
					<td>${departamento.nombre}</td>
					
				</tr>
			
			
			</c:forEach>
		
		</table>
            </section>
</body>
</html>