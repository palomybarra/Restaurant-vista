<%@page import="Business.City_Business"%>
<%@page import="java.util.ArrayList"%>
<%ArrayList<City_Business> lista = (ArrayList<City_Business>) request.getAttribute("lista");%>

<div class="container">
    <div class="row">
        <div class="col-2">
        </div>
        <div class="col-8" style="background-image: url(public/images/home/4.jpg);top: 80px" >
            <br />
            <h1 class="text-center " >Registro de Clientes</h1>
            <br />
            <div>
                <form action=""  method="post" class="text-center border border-warning" >
                    <br />
                    <table width="100%">
                        <tr>
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtmail">Correo Electronico:</label>
                                    <input type="email" class="form-control" id="txtmail" name="txtmail" required maxlength="100">
                                </div>
                            </td>
                            <td width="10%"></td>
                            <td width="45%">
                                <table>
                                    <tr>
                                        <td width="80%">  
                                            <div class="form-group">
                                                <label for="txtCardid">Rut</label>
                                                <input type="number"  class="form-control" id="txtCardid" name="txtCardid" required maxlength="10">
                                            </div>
                                        </td>
                                        <td>
                                            <div class="form-group">
                                                <label for="txt-">&nbsp;</label>
                                                <input type="text-"  class="form-control" id="txt-" name="txt" disabled="" placeholder="-">
                                            </div>
                                        </td>
                                        <td>
                                            <div class="form-group">
                                                <label for="txtCardiddv">Dv</label>
                                                <input  id="txtCardiddv" class="form-control" name="txtCardiddv" required maxlength="1">
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr >
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtName">Nombres</label>
                                    <input  id="txtName" class="form-control" name="txtName" required maxlength="100">
                                </div>
                            </td>
                            <td width="10%"></td>
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtLastName">Apellidos</label>
                                    <input  id="txtLastName" class="form-control" name="txtLastName" required maxlength="100">
                                </div>
                            </td>
                        </tr>
                        <tr >
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtPhone">Telefono</label>
                                    <input  id="txtPhone" class="form-control" name="txtPhone" required maxlength="12">
                                </div>
                            </td>
                            <td width="10%"></td>
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtBirth">Fecha de Nacimiento</label>
                                    <input type= "date" id="txtBirth" class="form-control" name="txtBirth" required >
                                </div>
                            </td>
                        </tr>
                        <tr >
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtAddress">Dirección</label>
                                    <input  id="txtAddress" class="form-control" name="txtAddress" required maxlength="100">
                                </div>
                            </td>
                            <td width="10%"></td>
                            <td width="45%">
                                <div class="form-group">
                                    <label for="ddCity">Ciudad</label>
                                    <select name="ddCity" id="ddCity" class="form-control">                                        
                                        <% for (City_Business al : lista) {
                                            out.print("<option value=" +al.getId_city()+">"+al.getDescription()+"</option>");
                                        }%>      
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr >
                            <td width="45%">
                                <div class="form-group">
                                    <label for="ddCommune">Comuna</label>
                                    <select name="ddCommune" id="ddCommune" class="form-control">
                                        <option value="1">Santiago</option>
                                        <option value="2">Concepcion</option>       
                                    </select>
                                </div>
                            </td>
                            <td width="10%"></td>
                            <td width="45%">
                                <div class="form-group">
                                    <label for="ddNationality">Nacionalidad</label> 
                                    <select name="ddNationality" id="ddNationality" class="form-control">
                                        <option value="1">Chile</option>
                                        <option value="2">Peru</option>       
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr >
                            <td width="45%">
                                <div class="form-group">
                                    <label for="txtPass">Contraseña</label>
                                    <input type="password" class="form-control" id="txtPass" name="txtPass" required maxlength="100">
                                </div>
                            </td>
                            <td width="10%"></td>
                            <td width="45%">
                             <button type="submit" class="button text-left">Registrar</button> 
                            </td>
                        </tr>
                    </table>

                    <br>
                    

                    <%String message = (String) request.getAttribute("mensaje");
                        if (message != null) {
                            out.print("<h3>" + message + "</h3>");
                        }
                    %>

                </form>
            </div>
            <ul class="list-group list-group-horizontal">
                <li><a href="index.jsp" ><h6><i class="fas fa-home"></i> Volver</h6></a></li>
                <li>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </li>
                <li><a href="LoginServlet" ><h6><i class="fas fa-glass-cheers"></i> Iniciar Sesión</h6></a></li>
            </ul>  
        </div>
        <div class="col-2">

        </div>
    </div>
</div>