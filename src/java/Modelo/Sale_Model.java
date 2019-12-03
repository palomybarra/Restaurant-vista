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
public class Sale_Model {
    private int id_sale;
    private int net_amount;
    private int tax_amount;
    private int total_amount;
    private Date sale_date;
    private String time_date;
    private int customer_id_customer;
    private int payment_id_payment;

    public Sale_Model() {
    }

    public Sale_Model(int id_sale, int net_amount, int tax_amount, int total_amount, Date sale_date, String time_date, int customer_id_customer, int payment_id_payment) {
        this.id_sale = id_sale;
        this.net_amount = net_amount;
        this.tax_amount = tax_amount;
        this.total_amount = total_amount;
        this.sale_date = sale_date;
        this.time_date = time_date;
        this.customer_id_customer = customer_id_customer;
        this.payment_id_payment = payment_id_payment;
    }

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public int getNet_amount() {
        return net_amount;
    }

    public void setNet_amount(int net_amount) {
        this.net_amount = net_amount;
    }

    public int getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(int tax_amount) {
        this.tax_amount = tax_amount;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public Date getSale_date() {
        return sale_date;
    }

    public void setSale_date(Date sale_date) {
        this.sale_date = sale_date;
    }

    public String getTime_date() {
        return time_date;
    }

    public void setTime_date(String time_date) {
        this.time_date = time_date;
    }

    public int getCustomer_id_customer() {
        return customer_id_customer;
    }

    public void setCustomer_id_customer(int customer_id_customer) {
        this.customer_id_customer = customer_id_customer;
    }

    public int getPayment_id_payment() {
        return payment_id_payment;
    }

    public void setPayment_id_payment(int payment_id_payment) {
        this.payment_id_payment = payment_id_payment;
    }
    
    
}
