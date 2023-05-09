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

    <title>Vista Cliente</title>

</head>

<body>



    <section class="menu-cliente">

    	

    	

    		<div style="display: flex; justify-content: flex-end; align-items: center; flex-wrap: wrap; gap: 13px">

    			<button type="button" class="btn btn-outline-primary"><</button>

    			<c:if test="${sessionScope.empleado.dni!=null}">
								<li style="margin-left: 100px;">
									<div>
										Bienvenid@, ${sessionScope.empleado.nombre}!</div>
								</li>
							</c:if>

    		</div>

    		

        <div class="iconos-menu-cliente">

            <ul>

            	<li>

                    <a href="">

                        <i class="fa-regular fa-bell fa-xl" style="color: #4979ff;"></i>

                    </a>

                </li>

                

                <li>

                    <a href="">

                        <i class="fa-solid fa-right-from-bracket fa-xl" style="color: #4979ff;"></i>

                    </a>

                </li>



            </ul>

        </div>

    

        

    </section>

    

    <section class="envios-cliente">

    
	       <!---foreach ver envios-->
                <table class="table ">
		
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
					
				</tr>
			
			
			</c:forEach>
		
		</table>

    </section> 

        

    

    

</body>

</html>