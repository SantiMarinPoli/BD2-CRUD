package DAO;

import BD.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import modelos.cargo;

public class DAOCargo {

    private Connection conexion;

    public DAOCargo() {
        conexion = DBUtil.getConexion();
    }

    public List<cargo> getCargo() throws SQLException {
        List<cargo> listaCargo = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT * FROM CARGO";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_cargo = rs.getInt("ID_CARGO");
            String nombre_cargo = rs.getString("NOMBRE_CARGO");

            cargo car = new cargo(id_cargo, nombre_cargo);
            listaCargo.add(car);
        }
        return listaCargo;
    }

    public String setCargo(int id_cargo) throws SQLException {
        String sql = "SELECT * FROM CARGO WHERE ID_CARGO = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_cargo);
        ResultSet rs = ps.executeQuery();

        String nombreCargo = null;
        if (rs.next()) {
            String nombre_cargo = rs.getString("NOMBRE_CARGO");
        }

        return nombreCargo;
    }

}
