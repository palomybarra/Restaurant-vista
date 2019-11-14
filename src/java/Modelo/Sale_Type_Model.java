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
public class Sale_Type_Model {
    private int id_sale_type;
    private String description;

    public Sale_Type_Model() {
    }

    public Sale_Type_Model(int id_sale_type, String description) {
        this.id_sale_type = id_sale_type;
        this.description = description;
    }

    public int getId_sale_type() {
        return id_sale_type;
    }

    public void setId_sale_type(int id_sale_type) {
        this.id_sale_type = id_sale_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
