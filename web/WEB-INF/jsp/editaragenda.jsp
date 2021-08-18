<%-- 
    Document   : editaragenda
    Created on : 13 ago. 2021, 17:25:57
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
                    <h4>Actualizar Agenda</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Codigo</label>
                        <input type="text" name="codigo" value="${lista[0].Codigo}" class="form-control" />
                        <label>Salon</label>
                        <input type="text" name="salon" value="${lista[0].Salon}" class="form-control" />
                        <label>Curso</label>
                        <input type="text" name="curso" value="${lista[0].Curso}" class="form-control" />
                        <label>Docente</label>
                        <input type="text" name="docente" value="${lista[0].Docente}" class="form-control" />
                        <label>Estudiantes</label>
                        <input type="text" name="estudiante" value="${lista[0].Estudiante}"  class="form-control" />
                        <label>Fecha</label>
                        <input type="text" name="fecha" value="${lista[0].Fecha}"  class="form-control" />
                        <label>Hora Inicio</label>
                        <input type="text" name=horainicio value="${lista[0].Horainicio}"  class="form-control" />
                        <label>Hora Final</label>
                        <input type="text" name="horafinal" value="${lista[0].Horafinal}"  class="form-control" />
                        
                        <input type="submit" value="Actualizar Agenda" class="btn btn-success"/>
                        <a href="agendar.htm" class="btn btn-primary">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>

