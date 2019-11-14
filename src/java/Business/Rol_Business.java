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
public class Rol_Business {
    private int id_rol;
    private String description;

    public Rol_Business() {
    }

    public Rol_Business(int id_rol, String description) {
        this.id_rol = id_rol;
        this.description = description;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
