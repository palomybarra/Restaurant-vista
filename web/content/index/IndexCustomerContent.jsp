<%-- 
Document   : IndexCustomerContent
Created on : 14-oct-2019, 19:31:57
Author     : paloma
--%>

<%@page import="Business.Restaurant_table_Business"%>
<% String name = (String) session.getAttribute("name");
    String lname = (String) session.getAttribute("lname");
    out.print("Bienvenido/a " + name + " " + lname);
%>



<a href="GetCartServlet">Pedir</a>
<a href="GetCommandServlet">Carrito</a>
<a href="EditSessionServlet">Perfil</a>
<a href="Logout">Cerrar Sesion</a>

