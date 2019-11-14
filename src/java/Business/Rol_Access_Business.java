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
public class Rol_Access_Business {
    private int id_rol_access;
    private String description;
    private int id_rol;

    public Rol_Access_Business() {
    }

    public Rol_Access_Business(int id_rol_access, String description, int id_rol) {
        this.id_rol_access = id_rol_access;
        this.description = description;
        this.id_rol = id_rol;
    }

    public int getId_rol_access() {
        return id_rol_access;
    }

    public void setId_rol_access(int id_rol_access) {
        this.id_rol_access = id_rol_access;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
