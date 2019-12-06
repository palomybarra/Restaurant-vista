/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author paloma
 */
public class Order_Command_Model{
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

    public Order_Command_Model() {
    }

    public Order_Command_Model(int id_order_command, int id_order, int id_menu, int id_customer, int person, String date, String time, int is_paid_out, int id_order_command_state, int id_restaurant_table, int id_sale_detail,
    int cantidad, int command_time) {
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
        this.cantidad=cantidad;
        this.command_time=command_time;
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

    public int getCommand_time() {
        return command_time;
    }

    public void setCommand_time(int command_time) {
        this.command_time = command_time;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
    
    
    
}
