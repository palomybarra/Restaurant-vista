package Business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;

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
    private Date date;
    private Date time;
    private int is_paid_out;
    private int id_order_command_state;
    private int id_restaurant_table;
    private int id_sale_detail;

    public Order_Command_Business () {
    }

    public Order_Command_Business (int id_order_command, int id_order, int id_menu, int id_customer, int person, Date date, Date time, int is_paid_out, int id_order_command_state, int id_restaurant_table, int id_sale_detail) {
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
        this.id_sale_detail = id_sale_detail;
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

    public void setPerson(int person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
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

    public int getId_sale_detail() {
        return id_sale_detail;
    }

    public void setId_sale_detail(int id_sale_detail) {
        this.id_sale_detail = id_sale_detail;
    }
    
    
    
}
