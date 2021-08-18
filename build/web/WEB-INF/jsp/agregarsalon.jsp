<%-- 
    Document   : agregar
    Created on : 12 ago. 2021, 14:47:23
    Author     : PROPIETARIO
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>
   <body style="background:linear-gradient(10deg, crimson,sienna, royalblue, indianred, purple);">

        
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agregar nuevo Salon</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Codigo</label>
                        <input type="text" name="codigo" class="form-control" />
                        <label>Salon</label>
                        <input type="text" name="salon" class="form-control" />
                        
                        
                        <input type="submit" value="Agregar Salon" class="btn btn-success"/>
                        <a href="listasalones.htm" class="btn btn-primary">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>