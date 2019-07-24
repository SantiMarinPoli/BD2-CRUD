<%@page import="java.util.List"%>
<%@page import="modelos.servicio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>AS ELECTRON S.A.S</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--PLUGINS-->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="assets/js/popper.js" type="text/javascript"></script>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>

        <%@include file="components/navbar.jsp" %>
        <br>

        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="row">
                        <div class="col-8">
                            <h2>Gestion de Incidencias</h2>
                        </div>


                        <div class="col-8">
                            <form>
                                <div class="input-group mb-3">
                                    <input type="text" class="form-control" placeholder="Buscar" aria-label="Username" aria-describedby="basic-addon1">


                                    <button type="button" class="btn btn-primary">Buscar</button>

                                </div>
                            </form>
                        </div>


                    </div>

                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Tecnico</th>
                                <th scope="col">Fecha Entrega</th>
                                <th scope="col">Nombre Cliente</th>
                                <th scope="col">Nombre Producto</th>
                                <th scope="col">Valor Servicio</th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List<servicio> listadoServicio
                                        = (List<servicio>) request.getAttribute("listadoServicio");
                                for (servicio ser : listadoServicio) {
                                    out.println("<tr>");
                                    out.println("<td" + ">" + ser.getId_servicio()+ "</td>");
                                    out.println("<td" + ">" + ser.getEmpleado() + "</td>");
                                    out.println("<td" + ">" + ser.getFecha_entrega() + "</td>");
                                    out.println("<td" + ">" + ser.getCliente() + "</td>");
                                    out.println("<td" + ">" + ser.getProducto() + "</td>");
                                    out.println("<td" + ">" + ser.getValor_servicio()+ "</td>");

                                    out.println("<td><a class='btn btn-danger' href='Controlador?opcion=borrar&id_servicio=" + ser.getId_servicio() + "'>Borrar</a></td>");
                                    out.println("<td><a class='btn btn-warning' href='Controlador?opcion=editar&id_servicio=" + ser.getId_servicio() + "'>Editar</a></td>");
                                    out.println("</tr>");
                                }
                            %>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>





    </body>
</html>
