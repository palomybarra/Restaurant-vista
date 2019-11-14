/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Modelo.*;

/**
 *
 * @author paloma
 */
public class Location_Business {
    private int id_location;
    private String description;

    public Location_Business() {
    }
    
    

    public Location_Business(int id_location, String description) {
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
