/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import BD.DBUtil;
import DAO.DAOEstadoServicio;
import DAO.DAOCargo;
import DAO.DAOCliente;
import DAO.DAOEmpleado;
import DAO.DAOProducto;
import DAO.DAOSede;
import DAO.DAOServicio;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.cargo;
import modelos.cliente;
import modelos.empleado;
import modelos.producto;
import modelos.sede;
import modelos.servicio;
import modelos.estadoServicio;

/**
 *
 * @author MARIN
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection conexion = DBUtil.getConexion();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opcion = request.getParameter("opcion");

        if (opcion != null) {
            System.out.println("El valor de la opcion es: " + opcion);
            if (opcion.equals("getServicio")) {
                try {
                    servicio(request, response);
                } catch (ServletException | IOException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);

                }
            }

            if (opcion.equals("nuevoServicio")) {

                try {
                    postServicio(request, response);
                } catch (ServletException | IOException ex) {
                    System.out.println("Excepcion: " + ex.getMessage());
                    request.getRequestDispatcher("/error.jsp").forward(request, response);
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        }

    }

    private void servicio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DAOServicio daoServicio = new DAOServicio();
            List<servicio> listadoServicio = daoServicio.getServicios();
            request.setAttribute("listadoServicio", listadoServicio);
            RequestDispatcher vista = request.getRequestDispatcher("index.jsp");

            vista.forward(request, response);

        } catch (Exception ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void postServicio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            DAOSede daoSede = new DAOSede();
            List<sede> listaSede = daoSede.getSede();
            request.setAttribute("listaSede", listaSede);

            DAOEmpleado daoEmpleado = new DAOEmpleado();
            List<empleado> listaEmpleado = daoEmpleado.getEmpleado();
            request.setAttribute("listaEmpleado", listaEmpleado);

            DAOCargo daoCargo = new DAOCargo();
            List<cargo> listaCargo = daoCargo.getCargo();
            request.setAttribute("listaCargo", listaCargo);

            DAOCliente daoCliente = new DAOCliente();
            List<cliente> listaCliente = daoCliente.getCliente();
            request.setAttribute("listaCliente", listaCliente);

            DAOProducto daoProducto = new DAOProducto();
            List<producto> listaProducto = daoProducto.getProducto();
            request.setAttribute("listaProducto", listaProducto);

            DAOEstadoServicio daoEstadoServicio = new DAOEstadoServicio();
            List<estadoServicio> listaEstado = daoEstadoServicio.getEstado();
            request.setAttribute("listaEstado", listaEstado);

            RequestDispatcher vista = request.getRequestDispatcher("incidencia.jsp");
            vista.forward(request, response);

        } catch (Exception ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String op = request.getParameter("op");
        if (op != null) {
            if (op.equalsIgnoreCase("insertar")) {
                guardar(request, op, response);
            } else {
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }

        }
    }

    private void guardar(HttpServletRequest request, String op, HttpServletResponse response) throws IOException, ServletException, NumberFormatException {
        try {
            //ps.setInt(1,ser.getId_servicio());
            int id_servicio = Integer.parseInt(request.getParameter("id_servicio"));
            //ps.setInt(2,ser.getId_sede());
            int id_sede = Integer.parseInt(request.getParameter("sede"));
            DAOSede daoSede = new DAOSede();
            String sede = daoSede.setSede(id_sede);

            //ps.setInt(3, ser.getId_cliente());
            int id_cliente = Integer.parseInt(request.getParameter("cliente"));
            DAOCliente daoCliente = new DAOCliente();
            String cliente = daoCliente.setCliente(id_cliente);

            //ps.setString(4,ser.getNumero_contacto());
            String numero_contacto = request.getParameter("numero_contacto");

            //ps.setInt(5, ser.getId_empleado());
            int id_empleado = Integer.parseInt(request.getParameter("empleado"));
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            String empleado = daoEmpleado.setEmpleado(id_empleado);

            //ps.setInt(6, ser.getId_cargo());
            int id_cargo = Integer.parseInt(request.getParameter("cargo"));
            DAOCargo daoCargo = new DAOCargo();
            String cargo = daoCargo.setCargo(id_cargo);

            //ps.setDate(7, ser.getFecha_ingreso());
            Date fecha_ingreso = Date.valueOf(request.getParameter("fecha_ingreso"));

            //ps.setDate(8, ser.getFecha_entrega());
            Date fecha_entrega = Date.valueOf(request.getParameter("fecha_entrega"));

            //ps.setString(9, ser.getComentario_cliente());
            String comentario_cliente = request.getParameter("comentario_cliente");

            //ps.setInt(10, ser.getId_producto());
            int id_producto = Integer.parseInt(request.getParameter("producto"));
            DAOProducto daoProducto = new DAOProducto();
            String producto = daoProducto.setProducto(id_producto);

            //ps.setString(11, ser.getEstado_producto());
            String estado_producto = request.getParameter("estado_producto");

            //ps.setInt(12, ser.getCantidad_producto());
            int cantidad_producto = Integer.parseInt(request.getParameter("cantidad_producto"));

            //ps.setDouble(13, ser.getValor_servicio());
            double valor_servicio = Double.parseDouble(request.getParameter("valor_servicio"));

            //ps.setInt(14, ser.getId_estadoServicio());
            int id_estadoServicio = Integer.parseInt(request.getParameter("estadoServicio"));
            DAOEstadoServicio daoEstadoServicio = new DAOEstadoServicio();
            String estadoServicio = daoEstadoServicio.setEstado(id_estadoServicio);

            //ps.setString(15, ser.getDireccion_cliente());
            String direccion_cliente = request.getParameter("direccion_cliente");

            servicio ser = new servicio(id_servicio, id_sede, sede, id_cliente, cliente, numero_contacto, id_empleado, empleado, id_cargo, cargo, fecha_ingreso, fecha_entrega, comentario_cliente, id_producto, producto, estado_producto, cantidad_producto, valor_servicio, id_estadoServicio, estadoServicio, direccion_cliente);
            DAOServicio daoServicio = new DAOServicio();

            daoServicio.guardar(ser);
            servicio(request, response);

        } catch (Exception ex) {
            System.out.println("Excepcion: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
