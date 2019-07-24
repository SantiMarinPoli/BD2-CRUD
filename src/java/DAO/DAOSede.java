/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import modelos.sede;

/**
 *
 * @author MARIN
 */
public class DAOSede {

    private Connection conexion;

    public DAOSede() {
        conexion = DBUtil.getConexion();
    }

    public List<sede> getSede() throws SQLException {
        List<sede> listaSede = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT ID_SEDE,NOMBRE_EMPRESA FROM SEDE";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_sede = rs.getInt("ID_SEDE");
            String nombre_empresa = rs.getString("NOMBRE_EMPRESA");

            sede sede = new sede(id_sede, nombre_empresa);
            listaSede.add(sede);
        }
        return listaSede;
    }

    public String setSede(int id_sede) throws SQLException {
        String sql = "SELECT ID_SEDE,NOMBRE_EMPRESA FROM SEDE WHERE ID_SEDE = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_sede);
        ResultSet rs = ps.executeQuery();

        String nombreSede = null;
        if (rs.next()) {
            String nombre_empresa = rs.getString("NOMBRE_EMPRESA");
        }

        return nombreSede;
    }

}
