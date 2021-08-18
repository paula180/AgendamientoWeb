<%-- 
    Document   : agendarsalon
    Created on : 13 ago. 2021, 10:27:26
    Author     : PROPIETARIO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendar salon</title>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    </head>
    <body style="background:linear-gradient(10deg, crimson,sienna, royalblue, indianred, purple);">
        
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Agendar Salon</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Codigo</label>
                        <input type="text" name="codigo" class="form-control" />
                        <br>
                        <label>Salon</label><br>
                        <tr>
                        <select name="salon" class="">
                           
                            <c:forEach var="dato" items="${listaSalones}">
                                <option value="${dato.id}"> ${dato.salon} </option>
                            </c:forEach> 
                            
                        </select>
                        </tr>
                        <br>
                        <label>Curso</label><br>
                        <select name="curso" class="">
                           
                            <c:forEach var="dato" items="${listaCursos}">
                                <option value="${dato.id}"> ${dato.curso} </option>
                            </c:forEach> 
                         </select>
                        <br>
                        <label>Docente</label><br>
                        <select name="docente" class="">
                           
                            <c:forEach var="dato" items="${listaCursos}">
                                <option value="${dato.id}"> ${dato.docente} </option>
                            </c:forEach> 
                         </select>
                        <br>
                        <label>Estudiantes</label><br>
                        <select name="estudiante" class="">
                           
                            <c:forEach var="dato" items="${listaCursos}">
                                <option value="${dato.id}"> ${dato.estudiante} </option>
                            </c:forEach> 
                         </select>
                        <br>
                         <label>Fecha</label>
                        <input type="date" name="fecha"  class="form-control" />
                        <label>Hora Inicio</label>
                        <input type="time" name="horainicio" class="form-control" />
                        <label>Hora Final</label>
                        <input type="time" name="horafinal" class="form-control" />
                        
                        <input type="submit" value="Agendar Salon" class="btn btn-success"/>
                        <a href="agendar.htm" class="btn btn-primary">Regresar</a>
                        
                       ${error}
                        
                        
                    </form>
                </div>
            </div>
        </div>
        
    </body>
</html>


