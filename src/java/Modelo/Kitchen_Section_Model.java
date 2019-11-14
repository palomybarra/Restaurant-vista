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
public class Kitchen_Section_Model {
    private int id_Kitchen_Section;
    private String description;

    public Kitchen_Section_Model() {
    }

    public Kitchen_Section_Model(int id_Kitchen_Section, String description) {
        this.id_Kitchen_Section = id_Kitchen_Section;
        this.description = description;
    }

    public int getId_Kitchen_Section() {
        return id_Kitchen_Section;
    }

    public String getDescription() {
        return description;
    }

    public void setId_Kitchen_Section(int id_Kitchen_Section) {
        this.id_Kitchen_Section = id_Kitchen_Section;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
