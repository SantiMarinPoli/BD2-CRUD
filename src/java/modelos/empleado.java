
package modelos;

public class empleado {
    
    private int id_empleado;
    private String tecnico;
    private String nomrbe_empleado;
    private String apellido_empleado;
    private int id_cargo;
    private String nombre_cargo;
    private int id_ciudad;
    private String ciudad;

    public empleado(int id_empleado, String nomrbe_empleado, String apellido_empleado, int id_cargo, String nombre_cargo, int id_ciudad, String ciudad) {
        this.id_empleado = id_empleado;
        this.nomrbe_empleado = nomrbe_empleado;
        this.apellido_empleado = apellido_empleado;
        this.id_cargo = id_cargo;
        this.nombre_cargo = nombre_cargo;
        this.id_ciudad = id_ciudad;
        this.ciudad = ciudad;
    }

    public empleado(int id_empleado, String tecnico) {
        this.id_empleado = id_empleado;
        this.tecnico = tecnico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNomrbe_empleado() {
        return nomrbe_empleado;
    }

    public void setNomrbe_empleado(String nomrbe_empleado) {
        this.nomrbe_empleado = nomrbe_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
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
        return "empleado{" + "id_empleado=" + id_empleado + ", tecnico=" + tecnico + ", nomrbe_empleado=" + nomrbe_empleado + ", apellido_empleado=" + apellido_empleado + ", id_cargo=" + id_cargo + ", nombre_cargo=" + nombre_cargo + ", id_ciudad=" + id_ciudad + ", ciudad=" + ciudad + '}';
    }
}
