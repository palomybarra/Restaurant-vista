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
public class Parameter_Group_Business {
    private int id_parameter_group;
    private String description;

    public Parameter_Group_Business() {
    }

    public Parameter_Group_Business(int id_parameter_group, String description) {
        this.id_parameter_group = id_parameter_group;
        this.description = description;
    }

    public int getId_parameter_group() {
        return id_parameter_group;
    }

    public String getDescription() {
        return description;
    }

    public void setId_parameter_group(int id_parameter_group) {
        this.id_parameter_group = id_parameter_group;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
