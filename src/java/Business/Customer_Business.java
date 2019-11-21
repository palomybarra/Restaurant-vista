/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import DAO.CustomerDAO;
import Modelo.Customer_Model;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.Date;
import java.util.logging.Level;

/**
 *
 * @author paloma
 */
public class Customer_Business {

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

    public Customer_Business() {
    }

    public Customer_Business(int id_customer, String name, String last_name, String email, String address, String phone, String activity, String Dob, int document_id, char document_id_dv, int id_commune, int id_country, int id_city, String password) {
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

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public boolean addCustomer(Customer_Business x) {

        try {
            Customer_Model model = new Customer_Model(x.getId_customer(), x.getName(), x.getLast_name(), x.getEmail(), x.getAddress(),
                    x.getPhone(), x.getActivity(), x.getDob(), x.getDocument_id(), x.getDocument_id_dv(), x.getId_commune(), x.getId_country(),
                    x.getId_city(), x.getPassword());
            CustomerDAO dao = new CustomerDAO();
            return dao.addCustomer(model);
        } catch (Exception e) {
            return false;
        }
    }

    public int loginCustomer(Customer_Business x) {

        try {
            Customer_Model model = new Customer_Model(x.getId_customer(), x.getName(), x.getLast_name(), x.getEmail(), x.getAddress(),
                    x.getPhone(), x.getActivity(), x.getDob(), x.getDocument_id(), x.getDocument_id_dv(), x.getId_commune(), x.getId_country(),
                    x.getId_city(), x.getPassword());
            CustomerDAO dao = new CustomerDAO();
            return dao.loginCustomer(model);
        } catch (Exception e) {
            return 3;//otro error
        }
    }

    public int loadCustomer(Customer_Business x) {

        try {
            Customer_Model model = new Customer_Model(x.getId_customer(), x.getName(), x.getLast_name(), x.getEmail(), x.getAddress(),
                    x.getPhone(), x.getActivity(), x.getDob(), x.getDocument_id(), x.getDocument_id_dv(), x.getId_commune(), x.getId_country(),
                    x.getId_city(), x.getPassword());
            CustomerDAO dao = new CustomerDAO();
            int res = dao.loadCustomer(model);
            x.setName(model.getName());
            x.setId_customer(model.getId_customer());
            x.setEmail(model.getEmail());
            x.setLast_name(model.getLast_name());
            return res;
        } catch (Exception e) {
            return 3;//otro error
        }
    }

    public int ReadCustomer(Customer_Business x) {

        try {
            Customer_Model model = new Customer_Model(x.getId_customer(), x.getName(), x.getLast_name(), x.getEmail(), x.getAddress(),
                    x.getPhone(), x.getActivity(), x.getDob(), x.getDocument_id(), x.getDocument_id_dv(), x.getId_commune(), x.getId_country(),
                    x.getId_city(), x.getPassword());
            CustomerDAO dao = new CustomerDAO();
            int res = dao.ReadCustomer(model);
            x.setName(model.getName());
            x.setLast_name(model.getLast_name());
            x.setEmail(model.getEmail());
            x.setAddress(model.getAddress());
            x.setPhone(model.getPhone());
            x.setActivity(model.getActivity());
            x.setDob(model.getDob());
            x.setDocument_id(model.getDocument_id());
            x.setDocument_id_dv(model.getDocument_id_dv());
            x.setId_commune(model.getId_commune());
            x.setId_city(model.getId_city());
            x.setId_country(model.getId_country());

            return res;
        } catch (Exception e) {
            return 2;//otro error
        }
    }

    public int UpdateCustomer(Customer_Business x) {

        try {
            Customer_Model model = new Customer_Model(x.getId_customer(), x.getName(), x.getLast_name(), x.getEmail(), x.getAddress(),
                    x.getPhone(), x.getActivity(), x.getDob(), x.getDocument_id(), x.getDocument_id_dv(), x.getId_commune(), x.getId_country(),
                    x.getId_city(), x.getPassword());
            CustomerDAO dao = new CustomerDAO();
            int res = dao.UpdateCustomer(model);
            return res;
        } catch (Exception e) {
            return 0;
        }
    }
}
