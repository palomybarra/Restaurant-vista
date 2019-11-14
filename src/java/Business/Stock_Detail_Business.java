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
public class Stock_Detail_Business {
    private int id_Stock_Detail;
    private char transaction;
    private int stock_id_stock;
    private int id_location;
    private int id_item;

    public Stock_Detail_Business() {
    }

    
    public Stock_Detail_Business(int id_Stock_Detail, char transaction, int stock_id_stock, int id_location, int id_item) {
        this.id_Stock_Detail = id_Stock_Detail;
        this.transaction = transaction;
        this.stock_id_stock = stock_id_stock;
        this.id_location = id_location;
        this.id_item = id_item;
    }

    public int getId_Stock_Detail() {
        return id_Stock_Detail;
    }

    public char getTransaction() {
        return transaction;
    }

    public int getStock_id_stock() {
        return stock_id_stock;
    }

    public int getId_location() {
        return id_location;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_Stock_Detail(int id_Stock_Detail) {
        this.id_Stock_Detail = id_Stock_Detail;
    }

    public void setTransaction(char transaction) {
        this.transaction = transaction;
    }

    public void setStock_id_stock(int stock_id_stock) {
        this.stock_id_stock = stock_id_stock;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }
    
    
}
