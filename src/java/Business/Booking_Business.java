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
public class Booking_Business {
    private int id_booking;
    private Date book_date;
    private Date book_time;
    private int id_customer;
    private int id_restaurant_table;

    public Booking_Business() {
    }

    public Booking_Business(int id_booking, Date book_date, Date book_time, int id_customer, int id_restaurant_table) {
        this.id_booking = id_booking;
        this.book_date = book_date;
        this.book_time = book_time;
        this.id_customer = id_customer;
        this.id_restaurant_table = id_restaurant_table;
    }

    public int getId_booking() {
        return id_booking;
    }

    public Date getBook_date() {
        return book_date;
    }

    public Date getBook_time() {
        return book_time;
    }

    public int getId_customer() {
        return id_customer;
    }

    public int getId_restaurant_table() {
        return id_restaurant_table;
    }

    public void setId_booking(int id_booking) {
        this.id_booking = id_booking;
    }

    public void setBook_date(Date book_date) {
        this.book_date = book_date;
    }

    public void setBook_time(Date book_time) {
        this.book_time = book_time;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public void setId_restaurant_table(int id_restaurant_table) {
        this.id_restaurant_table = id_restaurant_table;
    }
    
    
}
