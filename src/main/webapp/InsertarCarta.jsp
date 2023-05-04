<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar Carta - SanchezExpress</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>


    <section style="display: flex; justify-content: center; align-items: center; flex-wrap: wrap; width: 100%; height: 80vh;">
        <div style="box-shadow: 0px 0px 10px rgb(127, 140, 255); padding: 30px;">
            <h2>Insertar Carta</h2>
            <br>
            <form method="post" action = "ControladorCarta"  class="signin-form" style="width: 400px;">
                
             
                  
                  
              <label class="label" for="password">Desea enviarlo mensualmente?</label>
              <br>
              <br>
                <select class="form-select" aria-label="Default select example" name="mensual">
                    <option value="Si">Si</option>
                    <option value="No">No</option>
                  </select>
            
                <br>
                <div class="form-group">
                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">Finalizar</button>
                    
                </div>
                
             
                
                
                <br>
            </form>
        </div>

</body>
</html>