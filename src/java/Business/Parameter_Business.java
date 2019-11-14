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
public class Parameter_Business {
    private int id_parameter;
    private String description;
    private int value;
    private String value_type;
    private int id_parameter_group;

    public Parameter_Business() {
    }

    public Parameter_Business(int id_parameter, String description, int value, String value_type, int id_parameter_group) {
        this.id_parameter = id_parameter;
        this.description = description;
        this.value = value;
        this.value_type = value_type;
        this.id_parameter_group = id_parameter_group;
    }
    
    public int getId_parameter() {
        return id_parameter;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    public String getValue_type() {
        return value_type;
    }

    public int getId_parameter_group() {
        return id_parameter_group;
    }

    public void setId_parameter(int id_parameter) {
        this.id_parameter = id_parameter;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setValue_type(String value_type) {
        this.value_type = value_type;
    }

    public void setId_parameter_group(int id_parameter_group) {
        this.id_parameter_group = id_parameter_group;
    }
    
    
    
}
