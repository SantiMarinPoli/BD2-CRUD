/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author MARIN
 */
public class estadoServicio {
    
    private int id_estadoServicio;
    private String nombre_estadoServicio;

    public estadoServicio(int id_estadoServicio, String nombre_estadoServicio) {
        this.id_estadoServicio = id_estadoServicio;
        this.nombre_estadoServicio = nombre_estadoServicio;
    }

    public int getId_estadoServicio() {
        return id_estadoServicio;
    }

    public void setId_estadoServicio(int id_estadoServicio) {
        this.id_estadoServicio = id_estadoServicio;
    }

    public String getNombre_estadoServicio() {
        return nombre_estadoServicio;
    }

    public void setNombre_estadoServicio(String nombre_estadoServicio) {
        this.nombre_estadoServicio = nombre_estadoServicio;
    }

    @Override
    public String toString() {
        return "estadoServicio{" + "id_estadoServicio=" + id_estadoServicio + ", nombre_estadoServicio=" + nombre_estadoServicio + '}';
    } 
}
