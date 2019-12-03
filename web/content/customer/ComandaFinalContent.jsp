<%-- 
    Document   : ComandaFinalContent
    Created on : 02-dic-2019, 15:29:04
    Author     : paloma
--%>

<%@page import="Business.Order_Command_Business"%>
<%@page import="java.util.ArrayList"%>
<% ArrayList<Order_Command_Business> lista = (ArrayList<Order_Command_Business>) request.getAttribute("lcomanda");%>
<div id="container">
    <header>
        <nav>
            <ul id="nav">
                <li><a href="index.jsp" class="current"><i class="fas fa-home"></i></a></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>

                <li><a href="MenuServlet">Menú</a></li>
                <li><a href="GetCartServlet">Pedir</a></li>
                <li><a href="GetCommandServlet">Carrito</a></li>
                <li><a href="EditSessionServlet">Perfil</a></li>
            </ul>
        </nav>
    </header>
    <!-- First Container -->
    <% if (lista.size() == 0) {
            out.print("<h6> Aún no haz realizado un pedido</h6>");
        } else {

            out.print("<table class='table'>");
            out.print("<thead>");
            out.print("<tr>");
            out.print("<th>Cantidad</th>");
            out.print("<th>Producto</th>");
            out.print("<th>Valor Unitario</th>");
            out.print("<th>Valor Total</th>");
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
                out.print("$"+al.getPrice());
                out.print("</td>");
                out.print("</td><td>");
                out.print("$"+al.calculaTotal());
                out.print("</td>");
                out.print("</tr>");
            }
            out.print("<tr>");
            out.print("<td>");
            Order_Command_Business bus = new Order_Command_Business();
            out.print("<h6>TOTAL A PAGAR : $"+ bus.totalFinal(lista) +"</h6>");
            out.print("</td><td>");

            out.print("</td>");
            out.print("</tr>");
            out.print("</table>");

    }%>
    <form method="post" action="GetCommandServlet">
        <input type="submit" value="Ir a pagar" class="button text-left">
    </form>


