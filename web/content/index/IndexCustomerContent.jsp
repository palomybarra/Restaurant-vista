<%-- 
    Document   : IndexCustomerContent
    Created on : 14-oct-2019, 19:31:57
    Author     : paloma
--%>

<% String name= (String)session.getAttribute("name");
        String lname=(String)session.getAttribute("lname");
        out.print("Bienvenido/a "+name+" "+lname);
        %>
        
        <a href="EditSessionServlet">Editar</a>
        <a href="MenuServlet">Menu</a>
        <a href="GetCartServlet">Mi Carrito</a>