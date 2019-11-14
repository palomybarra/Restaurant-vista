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
public class Box_in_Business {
    private int id_box_in;
    private int amount_in;
    private Date date_in;
    private Date time_in;
    private int id_box;
    private int id_payment;
    private int id_employee;

    public Box_in_Business() {
    }

    public Box_in_Business(int id_box_in, int amount_in, Date date_in, Date time_in, int id_box, int id_payment, int id_employee) {
        this.id_box_in = id_box_in;
        this.amount_in = amount_in;
        this.date_in = date_in;
        this.time_in = time_in;
        this.id_box = id_box;
        this.id_payment = id_payment;
        this.id_employee = id_employee;
    }

    public int getId_box_in() {
        return id_box_in;
    }

    public void setId_box_in(int id_box_in) {
        this.id_box_in = id_box_in;
    }

    public int getAmount_in() {
        return amount_in;
    }

    public void setAmount_in(int amount_in) {
        this.amount_in = amount_in;
    }

    public Date getDate_in() {
        return date_in;
    }

    public void setDate_in(Date date_in) {
        this.date_in = date_in;
    }

    public Date getTime_in() {
        return time_in;
    }

    public void setTime_in(Date time_in) {
        this.time_in = time_in;
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
