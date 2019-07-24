<form action="Controlador" method="post" class="form-group">

    <div class="row">
        <div class="col">
            <input type="hidden" id="id_report">

            <label>Seleccionar Sede</label>

            <select class="form-control">
                <option>AS ELECTRON MEDELLIN</option>
                <option>NORTE DE BOGOTA</option>
                <option>OCCIDENTE DE BOGOTA</option>
            </select>


        </div>

        <div class="col">
        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Seleccionar un Tecnico</label>

            <select class="form-control">
                <option>Santiago Cortes</option>
                <option>Mauricio Rios</option>
                <option>Jhon Jairo</option>
            </select>


        </div>

        <div class="col">

            <label>Tipo de Servicio</label>

            <select class="form-control">
                <option>Tecnico S.0</option>
                <option>Ingeniero Electronico</option>
                <option>Tenico Reparacion SmartPhone</option>
            </select>

        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Seleccinar el Cliente</label>

            <select class="form-control">
                <option>Santiago Cortes</option>
                <option>Mauricio Rios</option>
                <option>Jhon Jairo</option>
            </select>


        </div>

        <div class="col">

            <label>Numero Fijo o Movil del Cliente</label>
            <div class="input-group mb-3">
                <input type="tel" class="form-control" placeholder="Asignar el contacto del cliente">
            </div>
        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Seleccinar el Producto</label>

            <select class="form-control">
                <option>Celular LG G8</option>
                <option>Sony Smart TV</option>
                <option>PS4 PRO</option>
            </select>


        </div>

        <div class="col">

            <label>Cantidad del Producto</label>

            <div class="input-group mb-3">
                <input type="number" class="form-control">
            </div>
        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Estado del Producto</label>

            <select class="form-control">
                <option>Mal Estado</option>
                <option>Buen Estado</option>
            </select>


        </div>

        <div class="col">

        </div>


    </div>

    <div class="row">
        <div class="col">

            <label>Fecha de Ingreso</label>

            <div class="input-group mb-3">
                <input type="date" class="form-control">
            </div>
        </div>

        <div class="col">

            <label>Fecha de Entrega</label>

            <div class="input-group mb-3">
                <input type="date" class="form-control">
            </div>
        </div>

    </div>

    <div class="row">
        <div class="col">

            <label>Comentario Del Cliente</label>

            <div class="input-group">

                <textarea class="form-control" aria-label="With textarea" placeholder="Una breve explicacion del fallo con el producto"></textarea>
            </div>
        </div>

        <div class="col">

            <label>Observaciones De La Reparacion</label>

            <div class="input-group">

                <textarea class="form-control" aria-label="With textarea" placeholder="Una breve explicacion del fallo con el producto"></textarea>
            </div>
        </div>

    </div>

    <div class="row">
        <div class="col">

            <label>Valor del Servicio</label>

            <div class="input-group mb-3">
                <input type="number" class="form-control" placeholder="Asignar el total del producto">
            </div>
        </div>

        <div class="col">

        </div>

    </div>

    <div class="row">
        <div class="col">

            <label>Direccion Actual Cliente</label>

            <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="Asignar la direccion de la casa o empresa del cliente">
            </div>
        </div>

        <div class="col">

        </div>

    </div>


    <div class="row-3">
        <div class="col">
            <button type="button" class="btn btn-primary btn-lg btn-block">Guardar</button>
        </div>
    </div>
</form>