<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar Paquete - SanchezExpresstitle>
 <link rel="stylesheet" href="estilos.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>


    <section style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
        <div style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px;">
            <h2>Insertar Paquete</h2>
            <br>
            <form method="post" action = "ControladorPaquete"  class="signin-form" style="width: 400px;">
                
             
                  <br>
                  
                <div class="form-group mb-3">
                    <label class="label" for="name">Tama�o</label>
                    <input type="text" class="form-control" placeholder="Tama�o" required name="tamano">
                </div>

                <div class="form-group mb-3">
                    <label class="label" for="name">Peso </label>
                    <input type="text" class="form-control" placeholder="Peso" required name="peso">
                </div>

            
                <br>
                <div class="form-group">
                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">Finalizar</button>
                    
                </div>
                
             
                
                
                <br>
            </form>
        </div>
        
          
    </section>

</body>
</html>
