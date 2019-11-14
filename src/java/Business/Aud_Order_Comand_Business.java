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
public class Aud_Order_Comand_Business {
    private int id_aud_ordercommand;
    private int id_ordercommand;
    private int id_status_new;
    private int id_status_old;
    private Date date;

    public Aud_Order_Comand_Business() {
    }

    public Aud_Order_Comand_Business(int id_aud_ordercommand, int id_ordercommand, int id_status_new, int id_status_old, Date date) {
        this.id_aud_ordercommand = id_aud_ordercommand;
        this.id_ordercommand = id_ordercommand;
        this.id_status_new = id_status_new;
        this.id_status_old = id_status_old;
        this.date = date;
    }

    public int getId_aud_ordercommand() {
        return id_aud_ordercommand;
    }

    public int getId_ordercommand() {
        return id_ordercommand;
    }

    public int getId_status_new() {
        return id_status_new;
    }

    public int getId_status_old() {
        return id_status_old;
    }

    public Date getDate() {
        return date;
    }

    public void setId_aud_ordercommand(int id_aud_ordercommand) {
        this.id_aud_ordercommand = id_aud_ordercommand;
    }

    public void setId_ordercommand(int id_ordercommand) {
        this.id_ordercommand = id_ordercommand;
    }

    public void setId_status_new(int id_status_new) {
        this.id_status_new = id_status_new;
    }

    public void setId_status_old(int id_status_old) {
        this.id_status_old = id_status_old;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    
    
}
