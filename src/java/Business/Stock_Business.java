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
public class Stock_Business {
    private int id_Stock;
    private int qty;
    private int location_id_location;
    private int item_id_item ;
    private int item_um_id_um;

    public Stock_Business() {
    }
    
    

    public Stock_Business(int id_Stock, int qty, int location_id_location, int item_id_item, int item_um_id_um) {
        this.id_Stock = id_Stock;
        this.qty = qty;
        this.location_id_location = location_id_location;
        this.item_id_item = item_id_item;
        this.item_um_id_um = item_um_id_um;
    }

    public int getId_Stock() {
        return id_Stock;
    }

    public int getQty() {
        return qty;
    }

    public int getLocation_id_location() {
        return location_id_location;
    }

    public int getItem_id_item() {
        return item_id_item;
    }

    public int getItem_um_id_um() {
        return item_um_id_um;
    }

    public void setId_Stock(int id_Stock) {
        this.id_Stock = id_Stock;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setLocation_id_location(int location_id_location) {
        this.location_id_location = location_id_location;
    }

    public void setItem_id_item(int item_id_item) {
        this.item_id_item = item_id_item;
    }

    public void setItem_um_id_um(int item_um_id_um) {
        this.item_um_id_um = item_um_id_um;
    }
    
    
    
}
