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
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                <li><a href="MenuServlet">Menú</a></li>
                <li><a href="EditSessionServlet">Perfil</a></li>
            </ul>
        </nav>
    </header>
    <!-- First Container -->
<div class="wrapper">
    <div class="border"></div>
    <article class="menu">
<%ArrayList<Menu_Business> lista = (ArrayList<Menu_Business>) request.getAttribute("lista");
                String ch="checkbox";
                int cont=0;
                    for (Menu_Business al : lista) {                   
                        out.print("<div class='left'>");
                        out.print("<h4>"+al.getDescription()+": $"+al.getPrice()+"</h4>");
                        out.print("</div>");
                        out.print("<div class='left star'><img src='public/images/star_full.png' class='noeffects' alt=''><img src='public/images/star_full.png' class='noeffects' alt=''><img src='public/images/star_full.png' class='noeffects' alt=''><img src='public/images/star_half_full.png' class='noeffects' alt=''><img src='public/images/star_empty.png' class='noeffects' alt=''></div>");
                        //out.print("<input type=" +ch+ " name=" +ch+cont+ " value=" +al.getId_Menu()+"/>" );//sujeto a cambios
                        out.print("<div class='right menu-order'><a class='button' href='#'>Seleccionar</a></div>");
                        out.print("<img src='public/images/menu/pizza2.jpeg' class='left clear item' width='150' alt=''>");
                        out.print("<p class='left'>Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo. Quisque sit amet est et sapien ullamcorper pharetra. Vestibulum erat wisi, condimentum sed, commodo vitae.</p>");
                        out.print("<div class='border3'></div>");
                        out.print("<div class='left'>");
                        out.print("</div>");
                        cont++;
          }%>
    </article>
    <aside class="sidebar">
         <h3 class="">Bar</h3>
<%ArrayList<Menu_Business> lista2 = (ArrayList<Menu_Business>) request.getAttribute("lista");
                //esta lista debe ser modificada para traer los bebestibles
                int cont2=0;
                    for (Menu_Business al : lista2) {                   
                        out.print("<div class='left'>");
                        out.print("<h6>"+"Var:Bar"+": $"+"Var:Precio"+"</h6>");
                        out.print("</div>");
                        out.print("<div class='right menu-order'><a class='button' href='#'>+</a></div>");
                        out.print("<p class='left'>500cc/Cocacola</p>");
                        out.print("<div class='border3'></div>");
                        out.print("<div class='left'>");
                        out.print("</div>");
                        cont2++;
          }%>
    </aside>
        <aside class="sidebar">
            <h3 class="">Postres</h3>
<%ArrayList<Menu_Business> lista3 = (ArrayList<Menu_Business>) request.getAttribute("lista");
                //esta lista debe ser modificada para traer los bebestibles
                int cont3=0;
                    for (Menu_Business al : lista3) {                   
                        out.print("<div class='left'>");
                        out.print("<h6>"+"Var:Pos"+": $"+"Var:Precio"+"</h6>");
                        out.print("</div>");
                        out.print("<div class='right menu-order'><a class='button' href='#'>+</a></div>");
                        out.print("<p class='left'>Centella/algo mas xd</p>");
                        out.print("<div class='border3'></div>");
                        out.print("<div class='left'>");
                        out.print("</div>");
                        cont3++;
          }%>
    </aside>
</div>

</div>





