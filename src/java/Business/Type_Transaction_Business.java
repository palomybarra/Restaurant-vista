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
public class Type_Transaction_Business {
    private int id_type_transaction;
    private String description;

    public Type_Transaction_Business() {
    }

    public Type_Transaction_Business(int id_type_transaction, String description) {
        this.id_type_transaction = id_type_transaction;
        this.description = description;
    }

    public int getId_type_transaction() {
        return id_type_transaction;
    }

    public void setId_type_transaction(int id_type_transaction) {
        this.id_type_transaction = id_type_transaction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
