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
import modelos.empleado;

/**
 *
 * @author MARIN
 */
public class DAOEmpleado {

    private Connection conexion;

    public DAOEmpleado() {
        conexion = DBUtil.getConexion();
    }

    public List<empleado> getEmpleado() throws SQLException {
        List<empleado> listaEmpleado = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT ID_EMPLEADO, NOMBRE_EMPLEADO || ' ' || APELLIDO_EMPLEADO AS TECNICO FROM EMPLEADO";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_sede = rs.getInt("ID_EMPLEADO");
            String tecnico = rs.getString("TECNICO");

            empleado emp = new empleado(id_sede, tecnico);
            listaEmpleado.add(emp);
        }
        return listaEmpleado;
    }

    public String setEmpleado(int id_empleado) throws SQLException {
        String sql = "SELECT ID_EMPLEADO, NOMBRE_EMPLEADO || ' ' || APELLIDO_EMPLEADO AS TECNICO FROM EMPLEADO EMP WHERE EMP.ID_EMPLEADO = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_empleado);
        ResultSet rs = ps.executeQuery();

        String nombreTecnico = null;
        if (rs.next()) {
            String tecnico = rs.getString("TECNICO");
        }

        return nombreTecnico;
    }

}
