/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Business.CartBusiness;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.io.IOException;
import java.io.PrintWriter;
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
public class AddCartServlet extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id"));
        String desc=request.getParameter("desc");
        int price=Integer.parseInt(request.getParameter("price"));
        desc= desc.replace('_',' ');
        HttpSession session = request.getSession();
        int idcustomer=(int)(session.getAttribute("id"));
        CartBusiness cart=new CartBusiness();
        cart.setCustomer_id(idcustomer);
        cart.setId_menu(id);
        cart.setQty(1);           
        cart.setDescription(desc);
        cart.setPrice(price);
        boolean answer = cart.addCart(cart);
        //LOGGER.log(Level.INFO,"cus.addCustomer(cus);  " + cus.addCustomer(cus));
        if (answer) {
            request.setAttribute("mensaje", "Agregado al carrito");
        } else {
            request.setAttribute("mensaje", "sucedio algo :C");
        }
        request.getRequestDispatcher("MenuServlet").forward(request, response);
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
