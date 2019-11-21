<%@page import="Business.CartBusiness"%>
<%@page import="Business.Menu_Business"%>
<%@page import="java.util.ArrayList"%>
<div id="container">
    <header>
        <nav>
            <ul id="nav">
                <li><a href="index.jsp" class="current"><i class="fas fa-home"></i></a></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li><a href="MenuServlet">Menú</a></li>
                <li><a href="EditSessionServlet">Perfil</a></li>
                <li><a href="GetCartServlet">Mi Carrito</a></li>
            </ul>
        </nav>
    </header>
    <!-- First Container -->
    <div class="wrapper">
     
    <table class="table">
    <thead>
      <tr>
        <th>Pedido</th>
        <th>Cantidad</th>
        <th>total</th>
      </tr>
    </thead>
    <tbody>
        <%{
            ArrayList<CartBusiness> lista = (ArrayList<CartBusiness>) request.getAttribute("lista");
            for (CartBusiness al : lista) {
                    out.print("<tr>");
                    out.print("<td>");
                    out.print(al.getDescription());                    
                    out.print("</td><td>");
                    out.print(al.getQty());                                            
                    out.print("</td><td>");
                    out.print(al.calculaTotal());     
                    out.print("</td><td>");
                    out.print("</tr>");
                }
        }%>
  </table>
  </div>
  <div class='left menu-order'><a class='button' href="MenuServlet">Volver</a></div>
  <div class='rigt menu-order'><a class='button' href="MenuServlet">Volver</a></div>