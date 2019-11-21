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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author paloma
 */
public class EditSessionServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        if (session != null) {
            request.getRequestDispatcher("/page/EditSession.jsp").forward(request, response);
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
        processRequest(request, response);
        Customer_Business cus = new Customer_Business();
        HttpSession session = request.getSession();
        int id = (int) session.getAttribute("id");
        cus.setId_customer(id);
        cus.setDocument_id(Integer.parseInt(request.getParameter("txtCardid")));
        cus.setDocument_id_dv(request.getParameter("txtCardiddv").charAt(0));
        cus.setName(request.getParameter("txtName"));
        cus.setLast_name(request.getParameter("txtLastName"));
        cus.setAddress(request.getParameter("txtAddress"));
        cus.setPhone(request.getParameter("txtPhone"));
        try {            
            cus.setDob(request.getParameter("txtBirth"));
        } catch (Exception e) {

        }
        cus.setId_commune(Integer.parseInt(request.getParameter("ddCommune")));
        cus.setId_country(Integer.parseInt(request.getParameter("ddNationality")));
        cus.setPassword(request.getParameter("txtPass"));
        int res = cus.UpdateCustomer(cus);
        if (res == 1) {
            request.setAttribute("mensaje", "update");
        } else {
            request.setAttribute("mensaje", "noshe que pasho");
        }
        request.getRequestDispatcher("/page/EditSession.jsp").forward(request, response);

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
