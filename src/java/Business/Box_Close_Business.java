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
public class Box_Close_Business {
    private int id_box_close;
    private int amount;
    private Date date_open;
    private Date time_open;
    private int id_box;
    private int id_employee;

    public Box_Close_Business() {
    }

    public Box_Close_Business(int id_box_close, int amount, Date date_open, Date time_open, int id_box, int id_employee) {
        this.id_box_close = id_box_close;
        this.amount = amount;
        this.date_open = date_open;
        this.time_open = time_open;
        this.id_box = id_box;
        this.id_employee = id_employee;
    }

    public int getId_box_close() {
        return id_box_close;
    }

    public void setId_box_close(int id_box_close) {
        this.id_box_close = id_box_close;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate_open() {
        return date_open;
    }

    public void setDate_open(Date date_open) {
        this.date_open = date_open;
    }

    public Date getTime_open() {
        return time_open;
    }

    public void setTime_open(Date time_open) {
        this.time_open = time_open;
    }

    public int getId_box() {
        return id_box;
    }

    public void setId_box(int id_box) {
        this.id_box = id_box;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }
    
    
}
