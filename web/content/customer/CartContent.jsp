<%@page import="Business.Restaurant_table_Business"%>
<%@page import="Business.CartBusiness"%>
<%@page import="Business.Menu_Business"%>
<%@page import="java.util.ArrayList"%>
<%{
         ArrayList<CartBusiness> lista = (ArrayList<CartBusiness>) request.getAttribute("lista");
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
    <div class="wrapper">
        <%
                if (lista.size()==0) {
                    out.print("<h6> Aún no haz agregado nada desde el Menú</h6>");
                } else {
                    out.print("<table class='table'>");
                    out.print("<thead>");
                    out.print("<tr>");
                    out.print("<th>Pedido</th>");
                    out.print("<th>Cantidad</th>");
                    out.print("<th>total</th>");
                    out.print("<th>Modificar Cantidad</th>");
                    out.print("<th>Eliminar</th>");
                    out.print("</tr>");
                    out.print("</thead>");
                    out.print("<tbody>");
                    for (CartBusiness al : lista) {
                        out.print("<tr>");
                        out.print("<td>");
                        out.print(al.getDescription());
                        out.print("</td><td>");
                        out.print(al.getQty());
                        out.print("</td><td>");
                        out.print(al.calculaTotal());
                        out.print("</td><td>");
                        out.print("<div class='left menu-order'><a class='button' href=UpdateCart?cust=" + al.getCustomer_id() +"&menu="+al.getId_menu()+"&op=2> - </a></div> <div class='right menu-order'><a class='button' href=UpdateCart?cust=" + al.getCustomer_id() +"&menu="+al.getId_menu()+"&op=1> + </a></div>");
                        out.print("</td><td>");
                        out.print("<div class='right menu-order'><a class='button' href=DeleteCart?cust=" + al.getCustomer_id() +"&menu="+al.getId_menu()+">-</a></div>");
                        out.print("</td>");
                        out.print("</tr>");
                    }
                    out.print("<tr>");
                    out.print("<td>");
                    out.print("<h6>TOTAL</h6>");
                    out.print("</td><td>");
                    CartBusiness bus = new CartBusiness();
                    out.print("<h6>" + bus.totalFinal(lista) + "</h6>");
                    out.print("</td>");
                    out.print("</tr>");
                    out.print("</table>");
                }
            }%>
    </div>
    <div class='left menu-order'><a class='button' href="MenuServlet">Volver</a></div>
    <div class='rigt menu-order'><a class='button' href="CommandServlet">Realizar orden</a></div>