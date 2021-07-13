<%-- 
    Document   : listarAlumnos
    Created on : 12-jul-2021, 14:18:49
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Alumnos</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
    </head>
    <body>
        <div class="container-fluid">
            <h2>Listado de Alumnos</h2>

            <a class="alert-link" href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>

            <div class="table-responsive">
                <table class="table table-dark table-hover"
                       <tr>
                    <th>Alumno ID</th>
                    <th>Nombre</th>
                    <th>Domicilio</th>
                    <th>Email</th>
                    <th>Teléfono</th>
                    <th>Eliminar</th>
                    </tr>

                    <c:forEach var="alumno" items="${alumnos}">
                        <tr>
                            <td>
                                ${alumno.idAlumno}
                            </td>
                            <td>${alumno.nombre} ${alumno.apellido}</td>
                            <td>${alumno.domicilio.calle} ${alumno.domicilio.noCalle} ${alumno.domicilio.pais}</td>
                            <td>${alumno.contacto.email}</td>
                            <td>${alumno.contacto.telefono}</td>
                            <td><a class="alert-link" href="${pageContext.request.contextPath}/ServletEliminar?idAlumno=${alumno.idAlumno}">Eliminar</a></td>
                        </tr>
                    </c:forEach>
                </table>

            </div>
    </body>
</html>
