package CanteenSystem;

import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
>>>>>>> 3eb99c0bd13df64a441f360c7f8926ee9a0e14c4
import javax.persistence.Id;

@Entity
public class Invoice{
    @Id
<<<<<<< HEAD
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)

>>>>>>> 3eb99c0bd13df64a441f360c7f8926ee9a0e14c4
    private long invoice_id;
    private long user_id;
    private long food_id;
    private double invoice_date;
    private double invoice_time;

    public long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getFood_id() {
        return food_id;
    }

    public void setFood_id(long food_id) {
        this.food_id = food_id;
    }

    public double getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(double invoice_date) {
        this.invoice_date = invoice_date;
    }

    public double getInvoice_time() {
        return invoice_time;
    }

    public void setInvoice_time(double invoice_time) {
        this.invoice_time = invoice_time;
    }
}
