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
public class Customer_Model {

    private int id_customer;
    private String name;
    private String last_name;
    private String email;
    private String address;
    private String phone;
    private String activity;
    private String Dob;
    private int document_id;
    private char document_id_dv;
    private int id_commune;
    private int id_city;
    private int id_country;
    private String password;

    public Customer_Model() {
    }

    public Customer_Model(int id_customer, String name, String last_name, String email, String address, String phone, String activity, String Dob, int document_id, char document_id_dv, int id_commune, int id_country, int id_city, String password) {
        this.id_customer = id_customer;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.activity = activity;
        this.Dob = Dob;
        this.document_id = document_id;
        this.document_id_dv = document_id_dv;
        this.id_commune = id_commune;
        this.id_country = id_country;
        this.id_city = id_city;
        this.password = password;

    }

    public int getId_customer() {
        return id_customer;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getActivity() {
        return activity;
    }

    public String getDob() {
        return Dob;
    }

    public int getDocument_id() {
        return document_id;
    }

    public char getDocument_id_dv() {
        return document_id_dv;
    }

    public int getId_commune() {
        return id_commune;
    }

    public int getId_country() {
        return id_country;
    }

    public int getId_city() {
        return id_city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public void setDocument_id_dv(char document_id_dv) {
        this.document_id_dv = document_id_dv;
    }

    public void setId_commune(int id_commune) {
        this.id_commune = id_commune;
    }

    public void setId_country(int id_country) {
        this.id_country = id_country;
    }

}
