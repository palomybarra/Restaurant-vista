/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Business.Order_Command_Business;
import Business.Sale_Business;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author paloma
 */
public class PayServlet extends HttpServlet {

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
        request.getRequestDispatcher("/page/Pay.jsp").forward(request, response);

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
              
       
        HttpSession session = request.getSession(); 
        int idsale=(int)(session.getAttribute("venta")); 
        if(idsale==0)
        {
            request.setAttribute("mensaje", "No ha realizado pedido aún");
        }
        Sale_Business bus=new Sale_Business();
        Order_Command_Business com=new Order_Command_Business();
        com.setId_sale(idsale);
        bus.setId_sale(idsale);  
        
        String value = request.getParameter("tipo_attach");
        int radio_value;

        if ("2".equals(value))
        {
            radio_value = 2;
        }
        else
        {
            radio_value = 3;
        }
       
        bus.setPayment_id_payment(radio_value);        
        bus.addSale(bus);      
        ArrayList lista=com.getCommandPay();
        session.setAttribute("pago", radio_value);
        request.setAttribute("lcomanda", lista);
        session.setAttribute("venta", 0);        
        request.getRequestDispatcher("/page/PagoFinal.jsp").forward(request, response);

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
