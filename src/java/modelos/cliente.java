package modelos;

public class cliente {

    private int id_cliente;
    private String cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String numero_fijo;
    private String numero_movil;
    private int id_ciudad;
    private String ciudad;
    private String direccion_cliente;
    private String correo_cliente;

    public cliente(int id_cliente, String nombre_cliente, String apellido_cliente, String numero_fijo, String numero_movil, int id_ciudad, String ciudad, String direccion_cliente, String correo_cliente) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.numero_fijo = numero_fijo;
        this.numero_movil = numero_movil;
        this.id_ciudad = id_ciudad;
        this.ciudad = ciudad;
        this.direccion_cliente = direccion_cliente;
        this.correo_cliente = correo_cliente;
    }

    public cliente(int id_cliente, String cliente) {
        this.id_cliente = id_cliente;
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getNumero_fijo() {
        return numero_fijo;
    }

    public void setNumero_fijo(String numero_fijo) {
        this.numero_fijo = numero_fijo;
    }

    public String getNumero_movil() {
        return numero_movil;
    }

    public void setNumero_movil(String numero_movil) {
        this.numero_movil = numero_movil;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    @Override
    public String toString() {
        return "cliente{" + "id_cliente=" + id_cliente + ", cliente=" + cliente + ", nombre_cliente=" + nombre_cliente + ", apellido_cliente=" + apellido_cliente + ", numero_fijo=" + numero_fijo + ", numero_movil=" + numero_movil + ", id_ciudad=" + id_ciudad + ", ciudad=" + ciudad + ", direccion_cliente=" + direccion_cliente + ", correo_cliente=" + correo_cliente + '}';
    }

 
}
