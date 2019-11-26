<%-- 
    Document   : SelectTableContent
    Created on : 26-nov-2019, 10:42:12
    Author     : paloma
--%>
<%@page import="Business.Restaurant_table_Business"%>
<%@page import="Business.Menu_Business"%>
<%@page import="java.util.ArrayList"%>
<%ArrayList<Restaurant_table_Business> lista = (ArrayList<Restaurant_table_Business>) request.getAttribute("lista");%>
<div id="container">
    <header>
        <nav>
            <ul id="nav">
                <li><a href="index.jsp" class="current"><i class="fas fa-home"></i></a></li>
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
        <form action="SearchTable" method="get">
            <div class="form-group">
                <label>Cantidad de comensales:</label>
                <input type="number"  class="form-control" id="txtCardid" name="txtCantidad" required maxlength="2">
            </div> 
            <br><br>
            <button type="submit" class="button text-right">Buscar</button> 

        </form>

        <%--out.print("<a class='button' href=SearchTable?cant="  ">Buscar Mesa</a>");--%>
        <br><br>
        <br><br>
        <form action="tableServlet" method="post">
            <div class="form-group">
                <label for="ddMesa">Mesa</label>
                <select name="ddMesa" id="ddMesa" class="form-control">                                        
                    <%if (lista != null) {
                            for (Restaurant_table_Business al : lista) {
                                out.print("<option value=" + al.getId_Restaurant_table() + ">" + al.getDescription() + "(" + al.getQty() + "pers.)" + "</option>");
                        }
                    }%>      
                </select>
            </div>
            <button type="submit" class="button text-right">Seleccionar mesa</button>     
        </form>


    </div>
    <script type ="text/javascript">
        function valor()
        {
            var cantidad = getElementById("txtCantidad").value;
            return cantidad;
        }
    </script>






