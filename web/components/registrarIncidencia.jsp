<%@page import="modelos.producto"%>
<%@page import="modelos.estadoServicio"%>
<%@page import="modelos.cliente"%>
<%@page import="modelos.cargo"%>
<%@page import="modelos.empleado"%>
<%@page import="modelos.sede"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<form action="Controlador" method="post" class="form-group">

    <div class="row">
        <div class="col">
            <!--INPUT INSERT-->
            <input type="hidden" id="op" name="op" value="insertar">
            
            <!--ID_SERVICIO-->
            <input type="hidden" id="id_servicio" name="id_servicio" value="0">


            <label>Seleccionar Sede</label>

            <select class="form-control" name="sede" id="nombre_empresa" >
                  <%
                      List<sede> listaSede = (List<sede>) request.getAttribute("listaSede");
                      for (sede sede : listaSede) {
                          out.println("<option value='" + sede.getId_sede() + "' >" + sede.getNombre_empresa() + "</option>");
                      }
                  %>
                
            </select>


        </div>

        <div class="col">
        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Seleccionar un Tecnico</label>

            <select class="form-control" name="empleado" id="tecnico">
                  <%
                      List<empleado> listaEmpleado = (List<empleado>) request.getAttribute("listaEmpleado");
                      for (empleado emp : listaEmpleado) {
                          out.println("<option value='" + emp.getId_empleado() + "' >" + emp.getTecnico() + "</option>");
                      }
                  %>
            </select>




        </div>

        <div class="col">

            <label>Tipo de Servicio</label>

            <select name="cargo" id="cargo" class="form-control">
                  <%
                      List<cargo> listaCargo = (List<cargo>) request.getAttribute("listaCargo");
                      for (cargo car : listaCargo) {
                          out.println("<option value='" + car.getId_cargo() + "' >" + car.getNombre_cargo() + "</option>");
                      }
                  %>
            </select>

        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Seleccinar el Cliente</label>

            <select class="form-control" name="cliente" id="cliente">
                  <%
                      List<cliente> listaCliente = (List<cliente>) request.getAttribute("listaCliente");
                      for (cliente cl : listaCliente) {
                          out.println("<option value='" + cl.getId_cliente() + "' >" + cl.getCliente() + "</option>");
                      }
                  %>
            </select>


        </div>

        <div class="col">

            <label>Numero Fijo o Movil del Cliente</label>
            <div class="input-group mb-3">
                <input type="tel" name="numero_contacto" id="numero_contacto" class="form-control" placeholder="Asignar el contacto del cliente">
            </div>
        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Seleccinar el Producto</label>

            <select class="form-control" name="producto" id="producto">
                  <%
                      List<producto> listaProducto = (List<producto>) request.getAttribute("listaProducto");
                      for (producto prod : listaProducto) {
                          out.println("<option value='" + prod.getId_producto() + "' >" + prod.getModelo_producto() + "</option>");
                      }
                  %>
            </select>


        </div>

        <div class="col">

            <label>Cantidad del Producto</label>

            <div class="input-group mb-3">
                <input type="number" name="cantidad_producto" id="cantidad_producto" class="form-control">
            </div>
        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Estado del Producto</label>

            <select name="estado_producto"  id="estado_producto" class="form-control">
                <option value="Mal Estado" >Mal Estado</option>
                <option value="Buen Estado" >Buen Estado</option>
            </select>


        </div>

        <div class="col">

            <label>Seleccinar el Producto</label>

            <select class="form-control" name="estadoServicio" id="estadoServicio">
                  <%
                      List<estadoServicio> listaEstado = (List<estadoServicio>) request.getAttribute("listaEstado");
                      for (estadoServicio es : listaEstado) {
                          out.println("<option value='" + es.getId_estadoServicio() + "' >" + es.getNombre_estadoServicio() + "</option>");
                      }
                  %>
            </select>


        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Fecha de Ingreso</label>

            <div class="input-group mb-3">
                <input type="date" name="fecha_ingreso" id="fecha_ingreso" class="form-control">
            </div>
        </div>

        <div class="col">

            <label>Fecha de Entrega</label>

            <div class="input-group mb-3">
                <input type="date" name="fecha_entrega" id="fecha_entrega"  class="form-control">
            </div>
        </div>

    </div>

    <div class="row">
        <div class="col">

            <label>Comentario Del Cliente</label>

            <div class="input-group">

                <textarea name="comentario_cliente" id="comentario_cliente" class="form-control" aria-label="With textarea" placeholder="Una breve explicacion del fallo con el producto"></textarea>
            </div>
        </div>

        <div class="col">

        </div>

    </div>

    <div class="row">
        <div class="col">

            <label>Valor del Servicio</label>

            <div class="input-group mb-3">
                <input type="number" name="valor_servicio" id="valor_servicio" class="form-control" placeholder="Asignar el total del producto">
            </div>
        </div>

        <div class="col">

        </div>

    </div>

    <div class="row">
        <div class="col">

            <label>Direccion Actual Cliente</label>

            <div class="input-group mb-3">
                <input type="text" name="direccion_cliente" id="direccion_cliente" class="form-control" placeholder="Asignar la direccion de la casa o empresa del cliente">
            </div>
        </div>

        <div class="col">

        </div>

    </div>

    <div class="row-3">
        <div class="col">
            <input type="submit" value="Guardar" name="post" id="post" class="btn btn-primary btn-lg btn-block" />
        </div>
    </div>
</form>