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
public class Item_Business {
    private int id_Item;
    private String description;
    private String barcode;
    private int cost;
    private int min;
    private int max;
    private int opt;
    private int um_id_um;

    public Item_Business() {
    }

    public Item_Business(int id_Item, String description, String barcode, int cost, int min, int max, int opt, int um_id_um) {
        this.id_Item = id_Item;
        this.description = description;
        this.barcode = barcode;
        this.cost = cost;
        this.min = min;
        this.max = max;
        this.opt = opt;
        this.um_id_um = um_id_um;
    }

    public int getId_Item() {
        return id_Item;
    }

    public String getDescription() {
        return description;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getCost() {
        return cost;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getOpt() {
        return opt;
    }

    public int getUm_id_um() {
        return um_id_um;
    }

    public void setId_Item(int id_Item) {
        this.id_Item = id_Item;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }

    public void setUm_id_um(int um_id_um) {
        this.um_id_um = um_id_um;
    }
    
    
    
    
}
