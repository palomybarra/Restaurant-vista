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
public class Item_Recipe_Business {
    private int id_item;
    private int id_recipe;
    private int id_kitchen_section;

    public Item_Recipe_Business() {
    }

    public Item_Recipe_Business(int id_item, int id_recipe, int id_kitchen_section) {
        this.id_item = id_item;
        this.id_recipe = id_recipe;
        this.id_kitchen_section = id_kitchen_section;
    }

    public int getId_item() {
        return id_item;
    }

    public int getId_recipe() {
        return id_recipe;
    }

    public int getId_kitchen_section() {
        return id_kitchen_section;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public void setId_recipe(int id_recipe) {
        this.id_recipe = id_recipe;
    }

    public void setId_kitchen_section(int id_kitchen_section) {
        this.id_kitchen_section = id_kitchen_section;
    }
    
    
}
