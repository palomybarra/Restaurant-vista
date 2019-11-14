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
public class Employee_Model {
    private int id_employee;
    private String name;
    private String last_name;
    private Date dob;
    private String phone;
    private String email;
    private int id_rol;

    public Employee_Model() {
    }

    public Employee_Model(int id_employee, String name, String last_name, Date dob, String phone, String email, int id_rol) {
        this.id_employee = id_employee;
        this.name = name;
        this.last_name = last_name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.id_rol = id_rol;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    
    
}
