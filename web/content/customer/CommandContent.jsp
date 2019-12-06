<%-- 
    Document   : PayContent
    Created on : 21-nov-2019, 13:48:43
    Author     : paloma
--%>

<%@page import="Business.Restaurant_table_Business"%>
<%@page import="Business.Order_Command_Business"%>
<%@page import="java.util.ArrayList"%>

<% ArrayList<Order_Command_Business> lista = (ArrayList<Order_Command_Business>) request.getAttribute("comanda");
%>

<div id="container">
    <header>
        <nav>
            <ul id="nav">
                  <li><a href="#" class="current"><i class="fas fa-home"></i></a></li>
                <%
                    if(session.getAttribute("mesa")!=null){
                    out.print("<li><a href='MenuServlet'>Menú</a></li>");}
                    else
                    {
                    out.print("<li><a href='tableServlet'>Menú</a></li>");}
                %>
                <li><a href="GetCartServlet">Pedir</a></li>
                <li><a href="GetCommandServlet">Carrito</a></li>
                <li><a href="EditSessionServlet">Perfil</a></li>
                <li><a href="Logout">Cerrar Sesion</a></li>
            </ul>
        </nav>
    </header>
    <!-- First Container -->
    <%      if (lista.size() == 0) {
                out.print("<h6> Aún no haz agregado nada desde el Menú</h6>");
            } else {
                out.print("<h6> Pedido Realizado -Tu pedido mas reciente estará en "+lista.get(0).getCommand_time()+" mins </h6>");
                out.print("<table class='table'>");
                out.print("<thead>");
                out.print(" <tr>");
                out.print("<th>Cantidad</th>");
                out.print("<th>Producto</th>");
                out.print(" <th>Valor Unitario</th>");
                out.print("</tr>");
                out.print("</thead>");
                out.print("<tbody>");

                for (Order_Command_Business al : lista) {
                    out.print("<tr>");
                    out.print("<td>");
                    out.print(al.getCantidad());
                    out.print("</td><td>");
                    out.print(al.getDescription());
                    out.print("</td><td>");
                    out.print(al.getPrice());
                    out.print("</td>");
                    out.print("</tr>");
                }
                out.print("<tr>");
                out.print("<td>");
                out.print("<h6>TOTAL</h6>");
                out.print("</td><td>");

                out.print("</td>");
                out.print("</tr>");
                out.print("</table> ");
            }
        %>

    <div class='left menu-order'><a class='button' href="PayServlet">Ir a pagar</a></div>
    <div class='rigt menu-order'><a class='button' href="MenuServlet">Pedir mas</a></div>
