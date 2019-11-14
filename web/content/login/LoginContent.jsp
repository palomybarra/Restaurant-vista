<div class="container">
    <div class="row">
        <div class="col-2">
        </div>
        <div class="col-8" style="background-image: url(public/images/home/4.jpg);top: 80px" >
            <br />
            <h1 class="text-center " >Iniciar Sesión</h1>
            <br />
            <div>
                <form action=""  method="post" class="text-center border border-warning" >
                    <br />
                    <div class="form-group">
                        <label for="txtmail">Correo Electronico:</label>
                        <input type="email" class="form-control" id="txtmail" name="txtmail" required maxlength="100">
                    </div>
                    <div class="form-group">
                        <label for="txtPass">Contraseña:</label>
                        <input type="password"  class="form-control" id="txtPass" name="txtPass" required maxlength="50"> 
                    </div>
                    <table width="100%">
                        <tr>
                            <td> 
                                <button type="submit" class="button text-left">Iniciar Sesión</button> 
                            </td>
                            <td></td>
                            <td>
                                <a href="#" class="button text-right">Omitir</a>
                            </td>
                        </tr>
                    </table>
                    <br/>
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
            <li><a href="NewCustomerServlet" ><h6><i class="fas fa-glass-cheers"></i> Registrarse</h6></a></li>
             </ul>  
        </div>
        <div class="col-2">

        </div>
    </div>
</div>