/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author paloma
 */
public class Box_Out_Business {
    private int id_box_out;
    private int amount_out;
    private Date date_out;
    private Date time_out;
    private int id_box;
    private int id_payment;
    private int id_employee;

    public Box_Out_Business() {
    }

    public Box_Out_Business(int id_box_out, int amount_out, Date date_out, Date time_out, int id_box, int id_payment, int id_employee) {
        this.id_box_out = id_box_out;
        this.amount_out = amount_out;
        this.date_out = date_out;
        this.time_out = time_out;
        this.id_box = id_box;
        this.id_payment = id_payment;
        this.id_employee = id_employee;
    }

    public int getId_box_out() {
        return id_box_out;
    }

    public void setId_box_out(int id_box_out) {
        this.id_box_out = id_box_out;
    }

    public int getAmount_out() {
        return amount_out;
    }

    public void setAmount_out(int amount_out) {
        this.amount_out = amount_out;
    }

    public Date getDate_out() {
        return date_out;
    }

    public void setDate_out(Date date_out) {
        this.date_out = date_out;
    }

    public Date getTime_out() {
        return time_out;
    }

    public void setTime_out(Date time_out) {
        this.time_out = time_out;
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

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }
    
    
}
