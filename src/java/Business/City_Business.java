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
public class City_Business {
    private int id_city;
    private int description;

    public City_Business() {
    }

    public City_Business(int id_city, int description) {
        this.id_city = id_city;
        this.description = description;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
    
    
    
}
