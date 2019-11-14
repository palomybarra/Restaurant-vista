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
public class Order_Command_State_Model {
    private int id_order_command_state;
    private String description;

    public Order_Command_State_Model() {
    }

    public Order_Command_State_Model(int id_order_command_state, String description) {
        this.id_order_command_state = id_order_command_state;
        this.description = description;
    }

    public int getId_order_command_state() {
        return id_order_command_state;
    }

    public String getDescription() {
        return description;
    }

    public void setId_order_command_state(int id_order_command_state) {
        this.id_order_command_state = id_order_command_state;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
