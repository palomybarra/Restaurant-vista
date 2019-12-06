<%-- 
    Document   : PagoFinalContent
    Created on : 03-dic-2019, 10:35:34
    Author     : paloma
--%>
<%@page import="Business.Restaurant_table_Business"%>
<%@page import="javax.persistence.criteria.Order"%>
<%@page import="Business.Order_Command_Business"%>
<%@page import="java.util.ArrayList"%>

<%  ArrayList<Order_Command_Business> lista = (ArrayList<Order_Command_Business>) request.getAttribute("lcomanda");
%>
<header>
    <nav>
        <ul id="nav">
            <li><a href="#" class="current"><i class="fas fa-home"></i></a></li>
                    <%
                        if (session.getAttribute("mesa") != null) {
                            out.print("<li><a href='MenuServlet'>Menú</a></li>");
                        } else {
                            out.print("<li><a href='tableServlet'>Menú</a></li>");
                        }
                    %>
            <li><a href="GetCartServlet">Pedir</a></li>
            <li><a href="GetCommandServlet">Carrito</a></li>
            <li><a href="EditSessionServlet">Perfil</a></li>
            <li><a href="Logout">Cerrar Sesion</a></li>

        </ul>
    </nav>
</header>

<div id="container">
    <h3>Pago Realizado, vuelve pronto!</h3>
    <h4>El detalle de tu pedido:</h4>
    <% out.print("<table class='table'>");
        out.print("<thead>");
        out.print(" <tr>");
        out.print("<th>Cantidad</th>");
        out.print("<th>Producto</th>");
        out.print(" <th>Valor Unitario</th>");
        out.print(" <th>Valor Total</th>");
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
            out.print("</td><td>");
            out.print(al.calculaTotal());
            out.print("</td>");

            out.print("</tr>");
        }
        out.print("<tr>");
        out.print("<td>");
        Order_Command_Business bus = new Order_Command_Business();
        out.print("<h6>TOTAL PAGADO: " + bus.totalFinal(lista) + "</h6>");
        out.print("</td>");
        out.print("</tr>");
        out.print("</table> ");
        bus.setId_sale(lista.get(0).getId_sale());
        out.print("<div class='left menu-order'><a class='button' href=PDF?id=" + bus.getId_sale() + ">+</a></div>");
    %>



</div>
<script type="text/javascript">
    
</script>  

