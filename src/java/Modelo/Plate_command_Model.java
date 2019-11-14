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
public class Plate_command_Model {
    private int id_menu;
    private int id_order_command;

    public Plate_command_Model() {
    }

    public Plate_command_Model(int id_menu, int id_order_command) {
        this.id_menu = id_menu;
        this.id_order_command = id_order_command;
    }

    public int getId_menu() {
        return id_menu;
    }

    public int getId_order_command() {
        return id_order_command;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public void setId_order_command(int id_order_command) {
        this.id_order_command = id_order_command;
    }
    
    
}
