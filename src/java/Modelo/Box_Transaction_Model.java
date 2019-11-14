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
public class Box_Transaction_Model {
    private int id_transaction;
    private int id_box_open;
    private int amount;
    private int id_box;
    private int id_payment;
    private int id_type_transaction;

    public Box_Transaction_Model() {
    }

    public Box_Transaction_Model(int id_transaction, int id_box_open, int amount, int id_box, int id_payment, int id_type_transaction) {
        this.id_transaction = id_transaction;
        this.id_box_open = id_box_open;
        this.amount = amount;
        this.id_box = id_box;
        this.id_payment = id_payment;
        this.id_type_transaction = id_type_transaction;
    }

    public int getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(int id_transaction) {
        this.id_transaction = id_transaction;
    }

    public int getId_box_open() {
        return id_box_open;
    }

    public void setId_box_open(int id_box_open) {
        this.id_box_open = id_box_open;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId_box() {
        return id_box;
    }

    public void setId_box(int id_box) {
        this.id_box = id_box;
    }

    public int getId_payment() {
        return id_payment;
    }

    public void setId_payment(int id_payment) {
        this.id_payment = id_payment;
    }

    public int getId_type_transaction() {
        return id_type_transaction;
    }

    public void setId_type_transaction(int id_type_transaction) {
        this.id_type_transaction = id_type_transaction;
    }
    
    
}
