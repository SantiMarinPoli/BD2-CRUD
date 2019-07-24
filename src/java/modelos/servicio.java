package modelos;

import java.sql.Date;

public class servicio {

    private int id_servicio;
    private int id_sede;
    private String sede;
    private int id_cliente;
    private String cliente;
    private String numero_contacto;
    private int id_empleado;
    private String empleado;
    private int id_cargo;
    private String cargo;
    private Date fecha_ingreso;
    private Date fecha_entrega;
    private String comentario_cliente;
    private int id_producto;
    private String producto;
    private String estado_producto;
    private int cantidad_producto;
    private double valor_servicio;
    private int id_estadoServicio;
    private String estadoServicio;
    private String direccion_cliente;
    private String observaciones_reparacion;
    private String diagnostico;

    public servicio(int id_servicio, int id_sede, String sede, int id_cliente, String cliente, String numero_contacto, int id_empleado, String empleado, int id_cargo, String cargo, Date fecha_ingreso, Date fecha_entrega, String comentario_cliente, int id_producto, String producto, String estado_producto, int cantidad_producto, double valor_servicio, int id_estadoServicio, String estadoServicio, String direccion_cliente) {
        this.id_servicio = id_servicio;
        this.id_sede = id_sede;
        this.sede = sede;
        this.id_cliente = id_cliente;
        this.cliente = cliente;
        this.numero_contacto = numero_contacto;
        this.id_empleado = id_empleado;
        this.empleado = empleado;
        this.id_cargo = id_cargo;
        this.cargo = cargo;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_entrega = fecha_entrega;
        this.comentario_cliente = comentario_cliente;
        this.id_producto = id_producto;
        this.producto = producto;
        this.estado_producto = estado_producto;
        this.cantidad_producto = cantidad_producto;
        this.valor_servicio = valor_servicio;
        this.id_estadoServicio = id_estadoServicio;
        this.estadoServicio = estadoServicio;
        this.direccion_cliente = direccion_cliente;
    }

    public servicio(int id_servicio, int id_sede, String sede, int id_cliente, String cliente, String numero_contacto, int id_empleado, String empleado, int id_cargo, String cargo, Date fecha_ingreso, Date fecha_entrega, String comentario_cliente, int id_producto, String producto, String estado_producto, int cantidad_producto, double valor_servicio, int id_estadoServicio, String estadoServicio, String direccion_cliente, String observaciones_reparacion, String diagnostico) {
        this.id_servicio = id_servicio;
        this.id_sede = id_sede;
        this.sede = sede;
        this.id_cliente = id_cliente;
        this.cliente = cliente;
        this.numero_contacto = numero_contacto;
        this.id_empleado = id_empleado;
        this.empleado = empleado;
        this.id_cargo = id_cargo;
        this.cargo = cargo;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_entrega = fecha_entrega;
        this.comentario_cliente = comentario_cliente;
        this.id_producto = id_producto;
        this.producto = producto;
        this.estado_producto = estado_producto;
        this.cantidad_producto = cantidad_producto;
        this.valor_servicio = valor_servicio;
        this.id_estadoServicio = id_estadoServicio;
        this.estadoServicio = estadoServicio;
        this.direccion_cliente = direccion_cliente;
        this.observaciones_reparacion = observaciones_reparacion;
        this.diagnostico = diagnostico;
    }
    
    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumero_contacto() {
        return numero_contacto;
    }

    public void setNumero_contacto(String numero_contacto) {
        this.numero_contacto = numero_contacto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getId_estadoServicio() {
        return id_estadoServicio;
    }

    public void setId_estadoServicio(int id_estadoServicio) {
        this.id_estadoServicio = id_estadoServicio;
    }

    public String getEstadoServicio() {
        return estadoServicio;
    }

    public void setEstadoServicio(String estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    public String getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(String estado_producto) {
        this.estado_producto = estado_producto;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getComentario_cliente() {
        return comentario_cliente;
    }

    public void setComentario_cliente(String comentario_cliente) {
        this.comentario_cliente = comentario_cliente;
    }

    public String getObservaciones_reparacion() {
        return observaciones_reparacion;
    }

    public void setObservaciones_reparacion(String observaciones_reparacion) {
        this.observaciones_reparacion = observaciones_reparacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public double getValor_servicio() {
        return valor_servicio;
    }

    public void setValor_servicio(double valor_servicio) {
        this.valor_servicio = valor_servicio;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    @Override
    public String toString() {
        return "servicio{" + "id_servicio=" + id_servicio + ", id_sede=" + id_sede + ", sede=" + sede + ", id_cliente=" + id_cliente + ", cliente=" + cliente + ", numero_contacto=" + numero_contacto + ", id_empleado=" + id_empleado + ", empleado=" + empleado + ", id_cargo=" + id_cargo + ", cargo=" + cargo + ", fecha_ingreso=" + fecha_ingreso + ", fecha_entrega=" + fecha_entrega + ", comentario_cliente=" + comentario_cliente + ", id_producto=" + id_producto + ", producto=" + producto + ", estado_producto=" + estado_producto + ", cantidad_producto=" + cantidad_producto + ", valor_servicio=" + valor_servicio + ", id_estadoServicio=" + id_estadoServicio + ", estadoServicio=" + estadoServicio + ", direccion_cliente=" + direccion_cliente + ", observaciones_reparacion=" + observaciones_reparacion + ", diagnostico=" + diagnostico + '}';
    }

}
