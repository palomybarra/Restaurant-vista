/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author paloma
 */
public class Menu_Model {
    private int id_Menu;
    private String description;
    private int time_wait;
    private int price;
    private int id_recipe;

    public Menu_Model() {
    }

    public Menu_Model(int id_Menu, String description, int time_wait, int price, int id_recipe) {
        this.id_Menu = id_Menu;
        this.description = description;
        this.time_wait = time_wait;
        this.price = price;
        this.id_recipe = id_recipe;
    }

    public int getId_Menu() {
        return id_Menu;
    }

    public String getDescription() {
        return description;
    }

    public int getTime_wait() {
        return time_wait;
    }

    public int getPrice() {
        return price;
    }

    public int getId_recipe() {
        return id_recipe;
    }

    public void setId_Menu(int id_Menu) {
        this.id_Menu = id_Menu;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime_wait(int time_wait) {
        this.time_wait = time_wait;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId_recipe(int id_recipe) {
        this.id_recipe = id_recipe;
    }
    
    
}
