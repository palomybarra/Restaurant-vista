<%-- 
    Document   : EditSessionContent
    Created on : 17-oct-2019, 20:22:04
    Author     : paloma
--%>
<%@page import="Business.Menu_Business"%>
<%@page import="java.util.ArrayList"%>
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
    <div class="wrapper">
        <div class="border"></div>
    </div>

    <center><h3>Datos</h3></center>
    <form action="EditSessionServlet" method="post">
        <center>
        <table>
            <tr>
                <td><label for="lblmail">Correo Electronico:</label></td>
                <td><label id="lblmail"  > xxxxxx</label></td>
            </tr>
            <tr>
                <td><label for="txtCardid">Rut</label></td>
                <td><input type="text"  id="txtCardid" name="txtCardid" required maxlength="10"> - 
                    <input type="text" id="txtCardiddv" name="txtCardiddv" required maxlength="1" style="width: 15px"></td>
            </tr>
            <tr>
                <td> <label for="txtName">Nombres</label></td>
                <td> <input type="text" id="txtName" name="txtName" required maxlength="100"></td>
            </tr>
            <tr>
                <td><label for="txtLastName">Apellidos</label></td>
                <td><input type="text" id="txtLastName" name="txtLastName" required maxlength="100"></td>
            </tr>
            <tr>
                <td><label for="txtPhone">Telefono</label></td>
                <td><input type="text" id="txtPhone" name="txtPhone" required maxlength="12"></td>
            </tr>
            <tr>
                <td><label for="txtBirth">Fecha de Nacimiento</label></td>
                <td><input  type= "date" id="txtBirth" name="txtBirth" required></td>
            </tr>
            <tr>
                <td><label for="txtAddress">Dirección</label></td>
                <td><input type="text" id="txtAddress" name="txtAddress" required maxlength="100"></td>
            </tr>
            <tr>
                <td><label for="ddCity">Ciudad</label></td>
                <td><select name="ddCity" id="ddCity">
                        <option value="1">Santiago</option>
                        <option value="2">Concepcion</option>       
                    </select></td>
            </tr>
            <tr>
                <td><label for="ddCommune">Comuna</label></td>
                <td> <select  name="ddCommune" id="ddCommune">
                        <option value="1">Santiago</option>
                        <option value="2">Concepcion</option>       
                    </select></td>
            </tr>
            <tr>
                <td><label for="ddNationality">Nacionalidad</label> </td>
                <td><select name="ddNationality" id="ddNationality">
                        <option value="1">Chile</option>
                        <option value="2">Peru</option>       
                    </select></td>
            </tr>
            <tr>
                <td><label for="txtPass">Contraseña</label></td>
                <td><input type="password" id="txtPass" name="txtPass" required maxlength="100"></td>
            </tr>
            <tr>
                <td></td>
                <td> <button type="submit" class="button text-left">Modificar</button> </td>
            </tr>
        </table>
            </center>

       

        <%String message = (String) request.getAttribute("mensaje");
            if (message != null) {
                out.print("<h3>" + message + "</h3>");
            }
        %>

    </form>


</div>






