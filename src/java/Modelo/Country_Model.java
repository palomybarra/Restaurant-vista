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
public class Country_Model {
    private int id_country;
    private String description;

    public Country_Model() {
    }

    public Country_Model(int id_country, String description) {
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
