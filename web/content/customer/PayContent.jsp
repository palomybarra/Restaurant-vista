<%-- 
    Document   : PayContent
    Created on : 02-dic-2019, 15:44:26
    Author     : paloma
--%>
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

<div id="container">
    <fieldset class="fields2">
        <dl>
            <dt><label>Metodo de pago:</label></dt>
            <dd>
                <input type="radio" name="tipo_attach" id="tipo_attach" onclick="toggle(this)" value="2"> Debito<br>
                <input type="radio" name="tipo_attach"  onclick="toggle(this)" value="3" > Credito<br>
            </dd>
        </dl>
    </fieldset>


    <div id="uno" style="display:none">
        <form method="post" action="PayServlet">
            <div class="form-group">
                <label for="ddBanco">Banco</label>
                <select name="ddBanco" id="ddBanco" class="form-control">
                    <option value="1">Banco Estado</option>
                    <option value="2">Coopeuch</option>       
                    <option value="2">Banco BBVA</option>       
                    <option value="2">Banco Consorcio</option>       
                    <option value="2">Banco Ripley</option>       
                    <option value="2">Banco Falabella</option>       
                    <option value="2">Banco Secutity</option>       
                    <option value="2">The bank of tokyo-Mitsubishi UFJ</option>       
                    <option value="2">Banco Itau Chile</option>       
                    <option value="2">Banco Bice</option>       
                    <option value="2">Corpbanca</option>       
                    <option value="2">Banco de Credito e Inversiones</option>       
                    <option value="2">Scotiabank Chile</option>       
                    <option value="2">Banco Internacional</option>       
                    <option value="2">Banco de Chile - Edwards -CrediChile</option>       
                </select>
            </div>
            <div class="form-group">
                <label for="ddCuenta">Comuna</label>
                <select name="ddCuenta" id="ddCuenta" class="form-control">
                    <option value="1">Cuenta Corriente</option>
                    <option value="2">Cuenta Vista</option>       
                    <option value="2">Cuenta de Ahorro </option>       
                </select>
            </div>
            <div class="form-group">
                <label for="txtName">Numero de Cuenta:</label>
                <input  type="number" id="txtName" class="form-control" name="txtName" required maxlength="20">
            </div>
             <input type="submit" value="Pagar" class="button text-left">
        </form>

    </div>

    <div id="dos" style="display:none">
        
        <form method="post" action="PayServlet">
            <div class="form-group">
                <label for="txtTarjeta">Numero de tarjeta de credito:</label>
                <input type="number" class="form-control" id="txtTarjeta" name="txtTarjeta" required maxlength="16">
            </div>
            <div class="form-group">
                <label for="txtPass">Codigo Validacion:</label>
                <input type="password" class="form-control" id="txtPass" name="txtPass" required maxlength="16">
            </div>
            <input type="submit" value="Pagar" class="button text-left">
        </form>

    </div>
</div>

<script type="text/javascript">
    function toggle(elemento) {
        if (elemento.value == 2) {
            document.getElementById("uno").style.display = "block";
            document.getElementById("dos").style.display = "none";
        }
        if (elemento.value == 3){
                    document.getElementById("uno").style.display = "none";
                    document.getElementById("dos").style.display = "block";
            
        }
    }
</script>
