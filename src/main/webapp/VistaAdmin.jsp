<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estilos/EstiloVistaEmpleado.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <title>Vista Administrador</title>
</head>
<body>

    
        
        <section class="bienvenido row">
                <div class="col-12">
                    <h2>Bienvenido, <!--nombre del empleado--></h2>
                </div>       
            </section>
            <img src="" alt="">
            
            <br>

            <section id="funciones">
                <h2>Opciones</h2>
        
                <div class="grupo-cuadrado">

                    

                    <a href="ControladorRegistrarse">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-solid fa-person-circle-plus fa-2xl" style="color: #FFFF;"></i>
                            <br>
                            <br>
                            <h6>Insertar cliente</h6>
                        </div>
                    </a>
                    
                    <a href="ControladorVerClientes">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-solid fa-user-group fa-2xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Ver clientes</h6>
                        </div>
                    </a>
                    
                    <a href="ControladorEnvioInsertar">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-solid fa-boxes-packing fa-2xl" style="color: #FFFF;"></i>
                            <br>
                            <br>
                            <h6>Insertar envío</h6>
                        </div>
                    </a>
                    
                    <a href="ControladorVerEnvios">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-regular fa-eye fa-2xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Ver envíos</h6>
                        </div>
                    </a>
                </div>
                <div class="grupo-cuadrado">

                    <a href="ControladorInsertarEmpleado">
                        <div class="cuadrado2 col-2 col-md-3">
                            <i class="fa-solid fa-address-card fa-xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Insertar empleado</h6>
                        </div>
                    </a>

                    <a href="ControladorVerSucursales">
                        <div class="cuadrado2 col-2 col-md-3">
                            <i class="fa-regular fa-eye fa-2xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Ver sucursales</h6>
                        </div>
                    </a>

                    <a href="ControladorVerDepartamentos">
                        <div class="cuadrado2 col-2 col-md-3">
                            <i class="fa-solid fa-building-user fa-2xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Ver departamentos</h6>
                        </div>
                    </a>
                    
                </div>
                
            </section>

            <br>
        
            <section id="envios"> <!--ver todos los envios hasta x linea-->
                <!--podemos poner para modificar o eliminar botones al lado de los envios-->
                <h2>Empleados de la sucursal</h2>
                <!---foreach ver envios-->
                
                <table class="table">



					<tr style="background-color: #eff0f5">
						
										<th> SUCURSAL</th>
										<th> DNI</th>
										<th> NOMBRE</th>
										<th> DIRECCION</th>
										<th> TELEFONO</th>
										<th> NUMERO DE SEGURIDAD SOCIAL</th>
										<th>CATEGORIA</th>
										<th> NOMINA</th>
										<th>COMISION </th>
										<th> DEPARTAMENTO</th>
										<th>CONTRASENA </th>
										
																	
												
				



					</tr>




					<c:forEach items="${empleados}" var="empleado">
			
					<tr>
						<th scope="row">${empleado.sucursal.codSucursal}</th>
						<td>${empleado.dni}</td>
						<td>${empleado.nombre}</td>
						<td>${empleado.direccion}</td>	
						<td>${empleado.telefono}</td>	
						<td>${empleado.numSeguridadS}</td>	
						<td>${empleado.categoria}</td>	
						<td>${empleado.nomina}</td>	
						<td>${empleado.comision}</td>		
						<td>${empleado.departamento.codDepartamento}</td>
						<td>${empleado.contrasena}</td>		
								
						
						
					<th><button type="button" class="btn btn-danger"><a href=ControladorEmpleadoEliminar?dni=${empleado.dni} style="color: white !important">DAR DE BAJA </a></button></th>
					<th><button type="button" class="btn btn-success"><a href=ControladorModificarEmpleado?dni=${empleado.dni} style="color: white !important">MODIFICAR </a></button></th>
					</tr>
			
			
					</c:forEach>
         
               
            </section>
        
    
    
</body>
</html>