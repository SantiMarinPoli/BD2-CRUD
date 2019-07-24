
package modelos;


public class tipoProducto {
    
    private int id_tipoProducto;
    private String nombre_tipoProducto;

    public tipoProducto(int id_tipoProducto, String nombre_tipoProducto) {
        this.id_tipoProducto = id_tipoProducto;
        this.nombre_tipoProducto = nombre_tipoProducto;
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

    @Override
    public String toString() {
        return "tipoProducto{" + "id_tipoProducto=" + id_tipoProducto + ", nombre_tipoProducto=" + nombre_tipoProducto + '}';
    }
}
