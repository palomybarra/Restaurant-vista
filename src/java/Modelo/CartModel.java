/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author paloma
 */
public class CartModel {
    private int cart_id;
    private int customer_id;
    private int qty;
    private int id_menu;
    private String description;
    private int price;
    private int time_wait;
    

    public CartModel() {
    }

    public CartModel(int cart_id, int customer_id, int qty, int id_menu, String description, int price, int time_wait) {
        this.cart_id = cart_id;
        this.customer_id = customer_id;
        this.qty = qty;
        this.id_menu = id_menu;
        this.description = description;
        this.price = price;
        this.time_wait=time_wait;
    }

    

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime_wait() {
        return time_wait;
    }

    public void setTime_wait(int time_wait) {
        this.time_wait = time_wait;
    }
    
    
    
    
}
