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
public class Location_Model {
    private int id_location;
    private String description;

    public Location_Model() {
    }
    
    

    public Location_Model(int id_location, String description) {
        this.id_location = id_location;
        this.description = description;
    }

    public int getId_location() {
        return id_location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
