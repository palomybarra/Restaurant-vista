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
public class Box_Model {
    private int id_box;
    private String description;
    private int is_open;

    public Box_Model() {
    }

    public Box_Model(int id_box, String description, int is_open) {
        this.id_box = id_box;
        this.description = description;
        this.is_open = is_open;
    }

    public int getId_box() {
        return id_box;
    }

    public void setId_box(int id_box) {
        this.id_box = id_box;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIs_open() {
        return is_open;
    }

    public void setIs_open(int is_open) {
        this.is_open = is_open;
    }
    
    
}
