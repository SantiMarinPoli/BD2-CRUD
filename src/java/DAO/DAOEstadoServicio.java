/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.DBUtil;
import modelos.estadoServicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author MARIN
 */
public class DAOEstadoServicio {

    private Connection conexion;

    public DAOEstadoServicio() {
        conexion = DBUtil.getConexion();
    }

    public List<estadoServicio> getEstado() throws SQLException {
        List<estadoServicio> listaEstado = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT * FROM ESTADO_SERVICIO";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_estadoServicio = rs.getInt("ID_ESTADO_SERVICIO");
            String nombre_estadoServicio = rs.getString("NOMBRE_ESRADO_SERVICIO");

            estadoServicio es = new estadoServicio(id_estadoServicio, nombre_estadoServicio);
            listaEstado.add(es);
        }
        return listaEstado;
    }

    public String setEstado(int id_estadoServicio) throws SQLException {
        String sql = "SELECT * FROM ESTADO_SERVICIO WHERE ID_ESTADO_SERVICIO = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_estadoServicio);
        ResultSet rs = ps.executeQuery();

        String nombreEstadoServicio = null;
        if (rs.next()) {
            String nombre_estadoServicio = rs.getString("NOMBRE_ESRADO_SERVICIO");
        }

        return nombreEstadoServicio;
    }

}
