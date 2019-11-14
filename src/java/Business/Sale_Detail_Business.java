/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


/**
 *
 * @author paloma
 */
public class Sale_Detail_Business {
    private int id_sale_detail;
    private int id_menu;
    private String plate_description;
    private int id_sale;
    private int id_order_command;
    private int id_sale_type;
    private int id_payment;

    public Sale_Detail_Business() {
    }

    public Sale_Detail_Business(int id_sale_detail, int id_menu, String plate_description, int id_sale, int id_order_command, int id_sale_type, int id_payment) {
        this.id_sale_detail = id_sale_detail;
        this.id_menu = id_menu;
        this.plate_description = plate_description;
        this.id_sale = id_sale;
        this.id_order_command = id_order_command;
        this.id_sale_type = id_sale_type;
        this.id_payment = id_payment;
    }

    public int getId_sale_detail() {
        return id_sale_detail;
    }

    public int getId_menu() {
        return id_menu;
    }

    public String getPlate_description() {
        return plate_description;
    }

    public int getId_sale() {
        return id_sale;
    }

    public int getId_order_command() {
        return id_order_command;
    }

    public int getId_sale_type() {
        return id_sale_type;
    }

    public int getId_payment() {
        return id_payment;
    }

    public void setId_sale_detail(int id_sale_detail) {
        this.id_sale_detail = id_sale_detail;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public void setPlate_description(String plate_description) {
        this.plate_description = plate_description;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public void setId_order_command(int id_order_command) {
        this.id_order_command = id_order_command;
    }

    public void setId_sale_type(int id_sale_type) {
        this.id_sale_type = id_sale_type;
    }

    public void setId_payment(int id_payment) {
        this.id_payment = id_payment;
    }
    
    
    
}
