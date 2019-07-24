<%@page import="java.util.List"%>
<%@page import="modelos.servicio"%>
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
        </tr>
    </thead>
    <tbody>
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td><a href="editarIncidencia.jsp" class="btn btn-warning">Editar</a>
                <a href="" class="btn btn-danger">Borrar</a>
            </td>
        </tr>
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td><a href="editarIncidencia.jsp" class="btn btn-warning">Editar</a>
                <a href="" class="btn btn-danger">Borrar</a>
            </td>
        </tr>
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td>@mdo</td>
            <td><a href="components/editarIncidencia.jsp" class="btn btn-warning">Editar</a>
                <a href="" class="btn btn-danger">Borrar</a>
            </td>
        </tr>
    </tbody>
</table>

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
        </tr>
    </thead>
    <tbody>
        <%
            List<servicio> listaServicio
                    = (List<servicio>) request.getAttribute("listadoServicio");
            for (servicio ser : listaServicio) {
                out.println("<tr>");
                out.println("<td" + ">" + ser.getEmpleado() + "</td>");
                out.println("<td" + ">" + ser.getFecha_entrega() + "</td>");
                out.println("<td" + ">" + ser.getCliente() + "</td>");
                out.println("<td" + ">" + ser.getProducto() + "</td>");

                out.println("<td><a class='btn btn-danger' href='Controlador?opcion=borrar&id_servicio=" + ser.getId_servicio() + "'>Borrar</a></td>");
                out.println("<td><a class='btn btn-warning' href='Controlador?opcion=editar&id_servicio=" + ser.getId_servicio() + "'>Editar</a></td>");
                out.println("</tr>");
            }
        %>

    </tbody>
</table>

