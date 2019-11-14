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
public class Restaurant_table_Model {
    private int id_Restaurant_table;
    private String description;
    private int id_table_state;
    private int qty;

    public Restaurant_table_Model() {
    }

    public Restaurant_table_Model(int id_Restaurant_table, String description, int id_table_state, int qty) {
        this.id_Restaurant_table = id_Restaurant_table;
        this.description = description;
        this.id_table_state = id_table_state;
        this.qty = qty;
    }

    public int getId_Restaurant_table() {
        return id_Restaurant_table;
    }

    public String getDescription() {
        return description;
    }

    public int getId_table_state() {
        return id_table_state;
    }

    public int getQty() {
        return qty;
    }

    public void setId_Restaurant_table(int id_Restaurant_table) {
        this.id_Restaurant_table = id_Restaurant_table;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_table_state(int id_table_state) {
        this.id_table_state = id_table_state;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    
    
    
}
