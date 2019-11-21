/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.MenuDAO;
import Modelo.Menu_Model;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author paloma
 */
public class Menu_Business {
    private int id_Menu;
    private String description;
    private int time_wait;
    private int price;
    private int type_location;

    public Menu_Business() {
    }

    public Menu_Business(int id_Menu, String description, int time_wait, int price, int id_recipe) {
        this.id_Menu = id_Menu;
        this.description = description;
        this.time_wait = time_wait;
        this.price = price;
        this.type_location = id_recipe;
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

    public int getType_location() {
        return type_location;
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

    public void setType_location(int type_location) {
        this.type_location = type_location;
    }
    
    public ArrayList<Menu_Business> getMenu() {
        ArrayList<Menu_Business> salida = new ArrayList<>();
        MenuDAO dao = new MenuDAO();
        ArrayList<Menu_Model> modelo = dao.getMenu();
        for (Menu_Model menu : modelo) {
            salida.add(new Menu_Business(
                    menu.getId_Menu(),
                    menu.getDescription(),
                    menu.getTime_wait(),
                    menu.getPrice(),
                    menu.getType_location()));
        }
        return salida;
    }
    
    public ArrayList<Menu_Business> getDrinks() {
        ArrayList<Menu_Business> salida = new ArrayList<>();
        MenuDAO dao = new MenuDAO();
        ArrayList<Menu_Model> modelo = dao.getDrinks();
        for (Menu_Model menu : modelo) {
            salida.add(new Menu_Business(
                    menu.getId_Menu(),
                    menu.getDescription(),
                    menu.getTime_wait(),
                    menu.getPrice(),
                    menu.getType_location()));
        }
        return salida;
    }
    public ArrayList<Menu_Business> getDesserts() {
        ArrayList<Menu_Business> salida = new ArrayList<>();
        MenuDAO dao = new MenuDAO();
        ArrayList<Menu_Model> modelo = dao.getDesserts();
        for (Menu_Model menu : modelo) {
            salida.add(new Menu_Business(
                    menu.getId_Menu(),
                    menu.getDescription(),
                    menu.getTime_wait(),
                    menu.getPrice(),
                    menu.getType_location()));
        }
        return salida;
    }
}
