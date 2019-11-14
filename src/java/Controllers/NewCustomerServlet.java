/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Business.Customer_Business;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paloma
 */
public class NewCustomerServlet extends HttpServlet {

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
        processRequest(request, response);
        request.getRequestDispatcher("/page/RegistrarCliente.jsp").forward(request, response);
        
        
        
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
        processRequest(request, response);
        Customer_Business cus = new Customer_Business();
        cus.setEmail(request.getParameter("txtmail"));
        cus.setDocument_id(Integer.parseInt(request.getParameter("txtCardid")));
        cus.setDocument_id_dv(request.getParameter("txtCardiddv").charAt(0));        
        cus.setName(request.getParameter("txtName"));
        cus.setLast_name(request.getParameter("txtLastName"));
        cus.setPhone(request.getParameter("txtPhone"));
        String date = request.getParameter("txtBirth");
        try {
            Date x = new SimpleDateFormat("MM-dd-yyyy").parse(date);
            cus.setDob(x);
        } catch (Exception e) {

        }
        cus.setAddress(request.getParameter("txtAddress"));
        cus.setId_city(Integer.parseInt(request.getParameter("ddCity")));
        cus.setId_commune(Integer.parseInt(request.getParameter("ddCommune")));
        cus.setId_country(Integer.parseInt(request.getParameter("ddNationality")));
        cus.setPassword(request.getParameter("txtPass"));
        boolean answer = cus.addCustomer(cus);
        LOGGER.log(Level.INFO,"cus.addCustomer(cus);  " + cus.addCustomer(cus));
        if (answer) {
            request.setAttribute("mensaje", "Cliente ingresado");
        } else {
            request.setAttribute("mensaje", "Cliente existente");
        }
        request.getRequestDispatcher("/page/RegistrarCliente.jsp").forward(request, response);
        

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
