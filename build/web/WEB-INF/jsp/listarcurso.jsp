
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body style="background:linear-gradient(10deg, crimson,sienna, royalblue, indianred, purple);">
        <br>
                <br>
         <div class="container" align="center">
            
            <a class="btn btn-info" href="index.htm">INDEX</a>
            <a class="btn btn-info" href="listasalones.htm" style="margin-left: 40px;">SALONES</a>
            <a class="btn btn-info" href="agendar.htm" style="margin-left: 40px;">AGENDAR SALON</a>
            
            
        </div>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregarcurso.htm" class="btn btn-light">Nuevo registro</a>
                </div>
                
                <div class="card-body">
                    
                    
                    
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>CODIGO</th>
                                <th>CURSO</th>
                                <th>DOCENTE</th>
                                <th>ESTUDIANTES</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            
                            <c:forEach var="dato" items="${lista}">
                            <tr>
                                
                                <td>${dato.Id}</td>
                                <td>${dato.Codigo}</td>
                                <td>${dato.Curso}</td>
                                <td>${dato.Docente}</td>
                                <td>${dato.Estudiante}</td>
                                
                                <td>
                                    <a href="editarcurso.htm?id=${dato.id}" class="btn btn-warning">Editar</a>
                                    <a href="eliminarcurso.htm?id=${dato.id}" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>

            </div>
            
        </div>
    </body>
</html>
