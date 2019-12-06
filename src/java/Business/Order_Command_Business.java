package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.OrderCommandDAO;
import Modelo.Order_Command_Model;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.IOException;



/**
 *
 * @author paloma
 */
public class Order_Command_Business {

    private int id_order_command;
    private int id_order;
    private int id_menu;
    private int id_customer;
    private int person;
    private String date;
    private String time;
    private int is_paid_out;
    private int id_order_command_state;
    private int id_restaurant_table;
    private int id_sale;
    private int cantidad;
    private int price;
    private String description;
    private int command_time;

    public Order_Command_Business() {
    }

    public Order_Command_Business(int id_order_command, int id_order, int id_menu, int id_customer, int person, String date, String time, int is_paid_out, int id_order_command_state, int id_restaurant_table, 
            int id_sale_detail, int cantidad, int command_time) {
        this.id_order_command = id_order_command;
        this.id_order = id_order;
        this.id_menu = id_menu;
        this.id_customer = id_customer;
        this.person = person;
        this.date = date;
        this.time = time;
        this.is_paid_out = is_paid_out;
        this.id_order_command_state = id_order_command_state;
        this.id_restaurant_table = id_restaurant_table;
        this.id_sale = id_sale_detail;
        this.cantidad = cantidad;
        this.command_time=command_time;
    }

    public int getCommand_time() {
        return command_time;
    }

    public void setCommand_time(int command_time) {
        this.command_time = command_time;
    }
     
    public int getId_order_command() {
        return id_order_command;
    }

    public void setId_order_command(int id_order_command) {
        this.id_order_command = id_order_command;
    }

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getPerson() {
        return person;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIs_paid_out() {
        return is_paid_out;
    }

    public void setIs_paid_out(int is_paid_out) {
        this.is_paid_out = is_paid_out;
    }

    public int getId_order_command_state() {
        return id_order_command_state;
    }

    public void setId_order_command_state(int id_order_command_state) {
        this.id_order_command_state = id_order_command_state;
    }

    public int getId_restaurant_table() {
        return id_restaurant_table;
    }

    public void setId_restaurant_table(int id_restaurant_table) {
        this.id_restaurant_table = id_restaurant_table;
    }

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int calculaTotal()
    {
        int total=this.price*this.cantidad;
        return total;
    }
    
    public int totalFinal(ArrayList<Order_Command_Business> lista)
    {
        int total=0;
        for (Order_Command_Business al : lista) 
        {
            total= total+al.calculaTotal();
        }
        
        return total;
    }
    

    public boolean addCommand(Order_Command_Business x) {

        try {
            Order_Command_Model model = new Order_Command_Model(x.getId_order_command(),
                    x.getId_order(),
                    x.getId_menu(),
                    x.getId_customer(),
                    x.getPerson(),
                    x.getDate(),
                    x.getTime(),
                    x.getIs_paid_out(),
                    x.getId_order_command_state(),
                    x.getId_restaurant_table(),
                    x.getId_sale(),
                    x.getCantidad(),
                    x.getCommand_time());

            OrderCommandDAO dao = new OrderCommandDAO();  
            boolean sale=dao.addCommand(model);
            this.setId_sale(model.getId_sale());
            
            return sale;
            
        } catch (Exception e) {
            return false;
        }
    }
   
    
    public ArrayList<Order_Command_Business> getCommand() {
        ArrayList<Order_Command_Business> salida = new ArrayList<>();
        OrderCommandDAO dao = new OrderCommandDAO();
        ArrayList<Order_Command_Model> modelo = dao.getCommand(this.getId_sale());
        for (Order_Command_Model model : modelo) {
            Order_Command_Business bus=new Order_Command_Business();
            bus.setCantidad(model.getCantidad());
            bus.setPrice(model.getPrice());
            bus.setId_sale(model.getId_sale());
            bus.setDescription(model.getDescription()); 
            bus.setCommand_time(model.getCommand_time());
            salida.add(bus);
        }
        return salida;
    }
    public ArrayList<Order_Command_Business> getCommandPay() {
        ArrayList<Order_Command_Business> salida = new ArrayList<>();
        OrderCommandDAO dao = new OrderCommandDAO();
        ArrayList<Order_Command_Model> modelo = dao.getCommandPay(this.getId_sale());
        for (Order_Command_Model model : modelo) {
            Order_Command_Business bus=new Order_Command_Business();
            bus.setCantidad(model.getCantidad());
            bus.setPrice(model.getPrice());
            bus.setId_sale(model.getId_sale());
            bus.setDescription(model.getDescription()); 
            bus.setCommand_time(model.getCommand_time());
            salida.add(bus);
        }
        return salida;
    }
    
    public String toString()
    {
        return cantidad+"  "+description+" ......"+calculaTotal();
    }
    
    public void pdf(ArrayList<Order_Command_Business> lista, int pago) throws FileNotFoundException, DocumentException, IOException 
    {
        
        Order_Command_Business bus=new Order_Command_Business();
        // Se crea el documento
        Document documento = new Document();
        
        // El OutPutStream para el fichero donde crearemos el PDF
        String id=lista.get(0).getId_sale()+"";      
        //FileOutputStream ficheroPDF = new FileOutputStream(file+".pdf");
        FileOutputStream ficheroPDF = new FileOutputStream("C:\\Users\\Public\\boleta"+id+".pdf");
        
        // Se asocia el documento de OutPutStream
        PdfWriter.getInstance(documento, ficheroPDF);
        
        // Se abre el documento
        documento.open();
        
        // Parrafo
        Paragraph titulo = new Paragraph("Boleta "+id+" \n\n",
                FontFactory.getFont("arial",
                        22,
                        Font.BOLD,
                        BaseColor.BLUE
                        )
        );
        
        // Añadimos el titulo al documento
        documento.add(titulo);
        
        // Creamos una tabla
        PdfPTable tabla = new PdfPTable(3);
        tabla.addCell("DESCRIPCION");
        tabla.addCell("CANTIDAD");
        tabla.addCell("PRECIO");       
        
        
        for (Order_Command_Business al : lista) 
        {
            tabla.addCell(al.getDescription());
            tabla.addCell(al.getCantidad()+"");
            tabla.addCell(al.calculaTotal()+"");
        }     
                
        // Añadimos la tabla al documento
        documento.add(tabla);
        String tipopago="";
        if(pago==2)
        {
            tipopago="Tarjeta de debito";
        }
        else
        {
            tipopago="Tarjeta de credito";
        }
        
        documento.add(new Paragraph ("Metodo de pago:"+tipopago));
        documento.add(new Paragraph ("Total pagado :"+bus.totalFinal(lista)+""));
        
        // Se cierra el documento
        documento.close();
        String ruta="C:\\Users\\Public\\boleta" + id + ".pdf";
        Runtime.getRuntime().exec ("rundll32 SHELL32.DLL,ShellExec_RunDLL "+ruta);
        

    }
}
