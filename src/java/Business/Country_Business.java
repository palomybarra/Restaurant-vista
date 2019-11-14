/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Modelo.Country_Model;


/**
 *
 * @author paloma
 */
public class Country_Business {
    private int id_country;
    private String description;

    public Country_Business() {
    }

    public Country_Business(int id_country, String description) {
        this.id_country = id_country;
        this.description = description;
    }

    public int getId_country() {
        return id_country;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
