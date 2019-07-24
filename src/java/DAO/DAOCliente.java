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
import modelos.cliente;

/**
 *
 * @author MARIN
 */
public class DAOCliente {

    private Connection conexion;

    public DAOCliente() {
        conexion = DBUtil.getConexion();
    }

    public List<cliente> getCliente() throws SQLException {
        List<cliente> listaCliente = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT ID_CLIENTE, NOMBRE_CLIENTE || ' ' || APELLIDO_CLIENTE AS CLIENTE FROM CLIENTE";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_cargo = rs.getInt("ID_CLIENTE");
            String cliente = rs.getString("CLIENTE");

            cliente cl = new cliente(id_cargo, cliente);
            listaCliente.add(cl);
        }
        return listaCliente;
    }

    public String setCliente(int id_cliente) throws SQLException {
        String sql = "SELECT ID_CLIENTE, NOMBRE_CLIENTE || ' ' || APELLIDO_CLIENTE AS CLIENTE FROM CLIENTE WHERE ID_CLIENTE = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_cliente);
        ResultSet rs = ps.executeQuery();

        String nombreCliete = null;
        if (rs.next()) {
            String cliente = rs.getString("CLIENTE");
        }

        return nombreCliete;
    }

}
