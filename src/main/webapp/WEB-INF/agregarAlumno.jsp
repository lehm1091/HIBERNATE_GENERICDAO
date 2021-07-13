<%-- 
    Document   : agregarAlumno
    Created on : 13-jul-2021, 10:38:11
    Author     : Luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
        <title>Agregar Alumno</title>
    </head>
    <body>
        <div class="container">
            <h3>Nuevo Usuario</h3>
             <a class="alert-link" href="${pageContext.request.contextPath}/ServletController">Volver</a>
            <form name="formAgregarAlumno" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre</label>
                    <input type="text" class="form-control" name="nombre"
                           id="nombre" aria-describedby="nombreHelp" placeholder="Ingrese su nombre">
                </div>
                <div class="form-group">
                    <label for="apellido">Apellido</label>
                    <input type="text" class="form-control" name="apellido"
                           id="apellido" aria-describedby="apellidoHelp" placeholder="Ingrese su apellido">
                </div>
                <div class="form-group">
                    <h4>Datos del domicilio</h4>
                </div>
                <div class="form-group">
                    <label for="calle">Calle</label>
                    <input type="text" class="form-control" name="calle"
                           id="calle" aria-describedby="calleHelp" placeholder="Ingrese la calle">
                </div>

                <div class="form-group">
                    <label for="no-calle">No. Calle</label>
                    <input type="text" class="form-control" name="no-calle"
                           id="no-calle" aria-describedby="no-calleHelp" placeholder="Ingrese el numero de calle">
                </div>

                <div class="form-group">
                    <label for="pais">País</label>
                    <input type="text" class="form-control" name="pais"
                           id="pais" aria-describedby="paisHelp" placeholder="Ingrese el pais">
                </div>

                <h4>Datos de contacto</h4>

                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email"
                           id="email" aria-describedby="emailHelp" placeholder="Ingrese su usuario">
                    <small id="emailHelp" class="form-text text-muted">Nunca compartiremos informacion suya</small>
                </div>

                <div class="form-group">
                    <label for="telefono">telefono</label>
                    <input type="text" class="form-control" name="telefono"
                           id="telefono" aria-describedby="telefonoHelp" placeholder="Ingrese el telefono">
                </div>


                <button type="submit" class="btn btn-primary">Agregar</button>
            </form>
        </div>   
    </body>
</html>
