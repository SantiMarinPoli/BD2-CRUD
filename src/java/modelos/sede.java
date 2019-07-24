
package modelos;

public class sede {
    
    private int id_sede;
    private String nombre_empresa;
    private int id_ciudad;
    private String ciudad;

    public sede(int id_sede, String nombre_empresa, int id_ciudad, String ciudad) {
        this.id_sede = id_sede;
        this.nombre_empresa = nombre_empresa;
        this.id_ciudad = id_ciudad;
        this.ciudad = ciudad;
    }

    public sede(int id_sede, String nombre_empresa) {
        this.id_sede = id_sede;
        this.nombre_empresa = nombre_empresa;
    }
    
    

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
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

    @Override
    public String toString() {
        return "sede{" + "id_sede=" + id_sede + ", nombre_empresa=" + nombre_empresa + ", id_ciudad=" + id_ciudad + ", ciudad=" + ciudad + '}';
    }
}
