<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/1257316c57.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="estilos/EstilosVistaEmpleados.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <title>Vista Empleado</title>
</head>
<body>

    <div class="row">
        <div class="col-12 col-md-9">
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

                    

                    <a href="#">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-solid fa-person-circle-plus fa-2xl" style="color: #FFFF;"></i>
                            <br>
                            <br>
                            <h6>Insertar cliente</h6>
                        </div>
                    </a>
                    
                    <a href="#">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-solid fa-user-group fa-2xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Ver clientes</h6>
                        </div>
                    </a>
                    
                    <a href="#">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-solid fa-boxes-packing fa-2xl" style="color: #FFFF;"></i>
                            <br>
                            <br>
                            <h6>Insertar envío</h6>
                        </div>
                    </a>
                    
                    <a href="#">
                        <div class="cuadrado col-2 col-md-3">
                            <i class="fa-regular fa-eye fa-2xl" style="color: #ffffff;"></i>
                            <br>
                            <br>
                            <h6>Ver envíos</h6>
                            
                        </div>
                    </a>
                    
                </div>
                
            </section>

            <br>
        
            <section id="envios"> <!--ver todos los envios hasta x linea-->
                <!--podemos poner para modificar o eliminar botones al lado de los envios-->
                <h2>Últimos envíos</h2>
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
					<th>${envio.sucursal.codSucursal}</th>
					<th>${envio.cliente.codCliente}</th>
					<th>${envio.fechaEntrada}</th>	
					<th>${envio.fechaSalida}</th>	
					<th>${envio.fechaLlegada}</th>	
					<th>${envio.entregado}</th>	
					<th>${envio.direccionDestino}</th>	
					<th>${envio.tracking}</th>	
					
					
					<!--				
					<th><button><a href=ControladorUsuarioEliminar?id=${usuario.id}>ELIMINAR UN USUARIO</a></button></th>
					<th><button><a href=ControladorModificar?id=${usuario.id}>MODIFICAR UN USUARIO</a></button></th>
					  -->
					
				</tr>
			
			
			</c:forEach>
		
		</table>
            </section>
        </div>
    
        <div class="calendario col-12 col-md-3">
            <div class="month">
                <ul>
                  <li>Mayo<br><span style="font-size:18px">2023</span></li>
                </ul>
              </div>
              
              <ul class="weekdays">
                <li>Mo</li>
                <li>Tu</li>
                <li>We</li>
                <li>Th</li>
                <li>Fr</li>
                <li>Sa</li>
                <li>Su</li>
              </ul>
              
              <ul class="days">
                <li>1</li>
                <li>2</li>
                <li>3</li>
                <li>4</li>
                <li>5</li>
                <li>6</li>
                <li>7</li>
                <li>8</li>
                <li>9</li>
                <li><span class="active">10</span></li>
                <li>11</li>
                <li>12</li>
                <li>13</li>
                <li>14</li>
                <li>15</li>
                <li>16</li>
                <li>17</li>
                <li>18</li>
                <li>19</li>
                <li>20</li>
                <li>21</li>
                <li>22</li>
                <li>23</li>
                <li>24</li>
                <li>25</li>
                <li>26</li>
                <li>27</li>
                <li>28</li>
                <li>29</li>
                <li>30</li>
              </ul> 
        </div>
    </div>

    
    
</body>
</html>