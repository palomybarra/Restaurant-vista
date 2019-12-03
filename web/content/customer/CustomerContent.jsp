<%@page import="Business.Restaurant_table_Business"%>
<div id="container">
    <header>
        <nav>
            <ul id="nav">
                <li><a href="index.jsp" class="current"><i class="fas fa-home"></i></a></li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                
                <%
                    if(session.getAttribute("mesa")!=null){
                    Restaurant_table_Business bus=(Restaurant_table_Business)session.getAttribute("mesa");
                    out.print("<li><a href='MenuServlet'>Menú</a></li>");}
                    else
                    {
                    out.print("<li><a href='tableServlet'>Menú</a></li>");}
                %>
                <li><a href="GetCartServlet">Pedir</a></li>
                <li><a href="GetCommandServlet">Carrito</a></li>
                <li><a href="EditSessionServlet">Perfil</a></li>
                
                
            </ul>
        </nav>
    </header>
    <!-- First Container -->
    <aside id="pricing-table" class="clear">
        <div>
            <h3><% String name = (String) session.getAttribute("name");
                String lname = (String) session.getAttribute("lname");
                out.print(name + " " + lname);
                %></h3>
            
            <img src="public/images/gallery/2.jpg" style="display:inline;" alt="" width="300" height="300">
            <h5>I'm an adventurer</h5>
            <h6> 
                </h6>
        </div>
    </aside>

</div>


