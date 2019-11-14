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
public class UM_Model {
    private int id_um;
    private String short_description;
    private String description;

    public UM_Model() {
    }

    public UM_Model(int id_um, String short_description, String description) {
        this.id_um = id_um;
        this.short_description = short_description;
        this.description = description;
    }

    public int getId_um() {
        return id_um;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getDescription() {
        return description;
    }

    public void setId_um(int id_um) {
        this.id_um = id_um;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
