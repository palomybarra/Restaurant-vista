/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.CartDAO;
import DAO.CustomerDAO;
import Modelo.CartModel;
import Modelo.Menu_Model;
import java.util.ArrayList;

/**
 *
 * @author paloma
 */
public class CartBusiness {
    private int cart_id;
    private int customer_id;
    private int qty;
    private int id_menu;
    private String description;
    private int price;
    private int time_wait;

    public CartBusiness() {
    }

    public CartBusiness(int cart_id, int customer_id, int qty, int id_menu, String description, int price) {
        this.cart_id = cart_id;
        this.customer_id = customer_id;
        this.qty = qty;
        this.id_menu = id_menu;
        this.description = description;
        this.price = price;
    }

    public int getTime_wait() {
        return time_wait;
    }

    public void setTime_wait(int time_wait) {
        this.time_wait = time_wait;
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

     
    
    
    
     public boolean addCart(CartBusiness x) {

        try {
            CartModel model = new CartModel(x.getCart_id(),x.getCustomer_id(),x.getQty(),x.getId_menu(),x.getDescription(),x.getPrice(),x.getTime_wait());
            CartDAO dao = new CartDAO();
            return dao.addCart(model);
        } catch (Exception e) {
            return false;
        }
    }
    
     public boolean deleteCart(CartBusiness x) {

        try {
            CartModel model = new CartModel(x.getCart_id(),x.getCustomer_id(),x.getQty(),x.getId_menu(),x.getDescription(),x.getPrice(),x.getTime_wait());
            CartDAO dao = new CartDAO();
            return dao.deleteCart(model);
        } catch (Exception e) {
            return false;
        }
    }
    
     public boolean updateCart(CartBusiness x) {

        try {
            CartModel model = new CartModel(x.getCart_id(),x.getCustomer_id(),x.getQty(),x.getId_menu(),x.getDescription(),x.getPrice(),x.getTime_wait());
            CartDAO dao = new CartDAO();
            return dao.updateCart(model);
        } catch (Exception e) {
            return false;
        }
    }
     
     public ArrayList<CartBusiness> getCart() {
        ArrayList<CartBusiness> salida = new ArrayList<>();
        CartDAO dao = new CartDAO();
        ArrayList<CartModel> modelo = dao.getCart(this.customer_id);
        for (CartModel cart : modelo) {
            salida.add(new CartBusiness(
                    cart.getCart_id(),
                    cart.getCustomer_id(),
                    cart.getQty(),
                    cart.getId_menu(),
                    cart.getDescription(),
                    cart.getPrice()));
        }
        return salida;
    }
     
    public int calculaTotal()
    {
        int total=this.price*this.qty;
        return total;
    }
    
    public int totalFinal(ArrayList<CartBusiness> lista)
    {
        int total=0;
        for (CartBusiness al : lista) 
        {
            total= total+al.calculaTotal();
        }
        
        return total;
    }
    public int getTime(ArrayList<CartBusiness> lista)
    {
        int time=0;
        for (CartBusiness al : lista) 
        {
           if (al.getTime_wait()>time)
               time=al.getTime_wait();
        }
        time=time+5;
        
        return time;
    }
}
