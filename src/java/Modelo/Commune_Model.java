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
public class Commune_Model {
    private int id_commune;
    private String description;
    private int id_city;

    public Commune_Model() {
    }

    public Commune_Model(int id_commune, String description, int id_city) {
        this.id_commune = id_commune;
        this.description = description;
        this.id_city = id_city;
    }

    public int getId_commune() {
        return id_commune;
    }

    public void setId_commune(int id_commune) {
        this.id_commune = id_commune;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }
    
    
    
}
