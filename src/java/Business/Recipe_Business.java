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
public class Recipe_Business {
    private int id_Recipe;
    private String description;
    private int id_menu;

    public Recipe_Business() {
    }

    public Recipe_Business(int id_Recipe, String description, int id_menu) {
        this.id_Recipe = id_Recipe;
        this.description = description;
        this.id_menu = id_menu;
    }

    public int getId_Recipe() {
        return id_Recipe;
    }

    public String getDescription() {
        return description;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_Recipe(int id_Recipe) {
        this.id_Recipe = id_Recipe;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }
    
    
    
}
