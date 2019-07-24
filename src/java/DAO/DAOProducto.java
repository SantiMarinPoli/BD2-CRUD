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
import modelos.producto;

/**
 *
 * @author MARIN
 */
public class DAOProducto {

    private Connection conexion;

    public DAOProducto() {
        conexion = DBUtil.getConexion();
    }

    public List<producto> getProducto() throws SQLException {
        List<producto> listaProducto = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT ID_PRODUCTO,MARCA_PRODUCTO FROM PRODUCTO";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_producto = rs.getInt("ID_PRODUCTO");
            String modelo_producto = rs.getString("MARCA_PRODUCTO");

            producto prod = new producto(id_producto, modelo_producto);
            listaProducto.add(prod);
        }
        return listaProducto;
    }

    public String setProducto(int id_producto) throws SQLException {
        String sql = "SELECT ID_PRODUCTO,MARCA_PRODUCTO FROM PRODUCTO WHERE ID_PRODUCTO = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_producto);
        ResultSet rs = ps.executeQuery();

        String modeloProducto = null;
        if (rs.next()) {
            String modelo_producto = rs.getString("MARCA_PRODUCTO");
        }

        return modeloProducto;
    }

}
