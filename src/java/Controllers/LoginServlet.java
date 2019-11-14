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
public class LoginServlet extends HttpServlet {

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
        request.getRequestDispatcher("/page/Login.jsp").forward(request, response);
        
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
        cus.setPassword(request.getParameter("txtPass"));
        int resp=cus.loginCustomer(cus);
        int res;
        String nombre="";
        String apellido="";
        
        if (resp==0) {
            request.setAttribute("mensaje", "usuario no existe");
        } else 
        {
            if (resp==1)   
            {
                res=cus.loadCustomer(cus);               
                request.setAttribute("mensaje", nombre);
                HttpSession session=request.getSession();
                session.setAttribute("id",cus.getId_customer());
                session.setAttribute("name", cus.getName());
                session.setAttribute("lname", cus.getLast_name());
                request.getRequestDispatcher("/page/IndexCustomer.jsp").forward(request, response);
                //request.setAttribute("mensaje", "Autenticacion correcta");
                
            }   
            else
            {
                if(resp==2)
                {
                    request.setAttribute("mensaje", "Contraseña incorrecta");
                    request.getRequestDispatcher("/page/Login.jsp").forward(request, response);
                }
                else
                {
                    request.setAttribute("mensaje", "Error al conectar");
                    request.getRequestDispatcher("/page/Login.jsp").forward(request, response);
                }
            }
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
