package modelos;

public class producto {

    private int id_producto;
    private String modelo_producto;
    private int id_tipoProducto;
    private String nombre_tipoProducto;

    public producto(int id_producto, String modelo_producto) {
        this.id_producto = id_producto;
        this.modelo_producto = modelo_producto;
    }

    public producto(int id_producto, int id_tipoProducto, String nombre_tipoProducto, String modelo_producto) {
        this.id_producto = id_producto;
        this.id_tipoProducto = id_tipoProducto;
        this.nombre_tipoProducto = nombre_tipoProducto;
        this.modelo_producto = modelo_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_tipoProducto() {
        return id_tipoProducto;
    }

    public void setId_tipoProducto(int id_tipoProducto) {
        this.id_tipoProducto = id_tipoProducto;
    }

    public String getNombre_tipoProducto() {
        return nombre_tipoProducto;
    }

    public void setNombre_tipoProducto(String nombre_tipoProducto) {
        this.nombre_tipoProducto = nombre_tipoProducto;
    }

    public String getModelo_producto() {
        return modelo_producto;
    }

    public void setModelo_producto(String modelo_producto) {
        this.modelo_producto = modelo_producto;
    }

    @Override
    public String toString() {
        return "producto{" + "id_producto=" + id_producto + ", modelo_producto=" + modelo_producto + ", id_tipoProducto=" + id_tipoProducto + ", nombre_tipoProducto=" + nombre_tipoProducto + '}';
    }
}
