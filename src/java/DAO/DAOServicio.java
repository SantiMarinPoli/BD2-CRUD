package DAO;

import BD.DBUtil;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import controlador.Controlador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.servicio;

public class DAOServicio {

    private Connection conexion;

    public DAOServicio() {
        conexion = DBUtil.getConexion();
    }

    public List<servicio> getServicios() throws SQLException {
        List<servicio> listadoServicio = new LinkedList<>();

        Statement stmt = conexion.createStatement();
        String sql = "SELECT SER.ID_SERVICIO,SER.ID_SEDE,SEDE.NOMBRE_EMPRESA AS SEDE,SER.ID_CLIENTE,CL.NOMBRE_CLIENTE || ' ' || CL.APELLIDO_CLIENTE AS CLIENTE,\n"
                + "                 SER.NUMERO_CONTACTOS,SER.ID_EMPLEADO,EMP.NOMBRE_EMPLEADO || ' '|| EMP.APELLIDO_EMPLEADO AS EMPLEADO,SER.ID_CARGO,CAR.NOMBRE_CARGO AS CARGO,\n"
                + "                SER.FECHA_INGRESO,SER.FECHA_ENTREGA,SER.ID_PRODUCTO,PROD.MARCA_PRODUCTO AS PRODUCTO,\n"
                + "                SER.ID_ESTADO_SERVICIO,ES.NOMBRE_ESRADO_SERVICIO AS ESTADOSERVICIO,\n"
                + "                SER.COMENTARIO_CLIENTE,SER.DIAGNOSTICO,SER.OBSERVACIONES_REPARACION,SER.CANTIDAD,SER.VALOR_SERVICIO,SER.ESTADO_PRODUCTO,SER.DIRECCION_CLIENTE\n"
                + "                FROM SERVICIO SER\n"
                + "                INNER JOIN SEDE\n"
                + "                ON SER.ID_SEDE = SEDE.ID_SEDE\n"
                + "                INNER JOIN CLIENTE CL\n"
                + "                ON SER.ID_CLIENTE = CL.ID_CLIENTE\n"
                + "                INNER JOIN EMPLEADO EMP\n"
                + "                ON SER.ID_EMPLEADO = EMP.ID_EMPLEADO\n"
                + "                INNER JOIN CARGO CAR\n"
                + "                ON SER.ID_CARGO = CAR.ID_CARGO\n"
                + "                INNER JOIN PRODUCTO PROD\n"
                + "                ON SER.ID_PRODUCTO = PROD.ID_PRODUCTO\n"
                + "                INNER JOIN ESTADO_SERVICIO ES\n"
                + "                ON SER.ID_ESTADO_SERVICIO = ES.ID_ESTADO_SERVICIO\n"
                + "                ORDER BY SER.ID_SERVICIO";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int id_servicio = rs.getInt("ID_SERVICIO");
            int id_sede = rs.getInt("ID_SEDE");
            String sede = rs.getString("SEDE");
            int id_cliente = rs.getInt("ID_CLIENTE");
            String cliente = rs.getString("CLIENTE");
            int id_empleado = rs.getInt("ID_EMPLEADO");
            String empleado = rs.getString("EMPLEADO");
            int id_cargo = rs.getInt("ID_CARGO");
            String cargo = rs.getString("CARGO");
            String numero_contacto = rs.getString("NUMERO_CONTACTOS");
            int id_producto = rs.getInt("ID_PRODUCTO");
            String producto = rs.getString("PRODUCTO");
            int cantidad_producto = rs.getInt("CANTIDAD");
            String estado_producto = rs.getString("ESTADO_PRODUCTO");
            int id_estadoServicio = rs.getInt("ID_ESTADO_SERVICIO");
            String estadoServicio = rs.getString("ESTADOSERVICIO");
            Date fecha_ingreso = rs.getDate("FECHA_INGRESO");
            Date fecha_entrega = rs.getDate("FECHA_ENTREGA");
            String comentario_cliente = rs.getString("COMENTARIO_CLIENTE");
            String observaciones_reparacion = rs.getString("OBSERVACIONES_REPARACION");
            String diagnostico = rs.getString("DIAGNOSTICO");
            double valor_servicio = rs.getDouble("VALOR_SERVICIO");
            String direccion_cliente = rs.getString("DIRECCION_CLIENTE");

            servicio ser = new servicio(id_servicio, id_sede, sede, id_cliente, cliente, numero_contacto, id_empleado, empleado, id_cargo, cargo, fecha_ingreso, fecha_entrega, comentario_cliente, id_producto, producto, estado_producto, cantidad_producto, valor_servicio, id_estadoServicio, estadoServicio, direccion_cliente, observaciones_reparacion, diagnostico);
            listadoServicio.add(ser);
        }
        return listadoServicio;
    }

    public int setServicio(int id_servicio) throws SQLException {
        String sql = "SELECT ID_SERVICIO FROM SERVICIO WHERE ID_SERVICIO = ?";
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_servicio);
        ResultSet rs = ps.executeQuery();

        int idServicio = 0;
        if (rs.next()) {
            int idservicio = rs.getInt("ID_SERVICIO");
        }

        return idServicio;
    }

    public void guardar(servicio ser) throws SQLException {

   

            String sql = "EXEC SP_INSERTAR_SERVICIO(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, ser.getId_servicio());
            ps.setInt(2, ser.getId_sede());
            ps.setInt(3, ser.getId_cliente());
            ps.setString(4, ser.getNumero_contacto());
            ps.setInt(5, ser.getId_empleado());
            ps.setInt(6, ser.getId_cargo());
            ps.setDate(7, ser.getFecha_ingreso());
            ps.setDate(8, ser.getFecha_entrega());
            ps.setString(9, ser.getComentario_cliente());
            ps.setInt(10, ser.getId_producto());
            ps.setString(11, ser.getEstado_producto());
            ps.setInt(12, ser.getCantidad_producto());
            ps.setDouble(13, ser.getValor_servicio());
            ps.setInt(14, ser.getId_estadoServicio());
            ps.setString(15, ser.getDireccion_cliente());

            ps.executeUpdate();

        } 

    

}
