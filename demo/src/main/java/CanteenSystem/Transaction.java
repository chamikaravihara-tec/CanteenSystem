package CanteenSystem;

import javax.persistence.Entity;

@Entity
public class Transaction {
    private int transaction_id;
    private int order_id;
    private long user_id;
    private long intem_id;
    private double transaction_date;
    private float order_amount;

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getIntem_id() {
        return intem_id;
    }

    public void setIntem_id(long intem_id) {
        this.intem_id = intem_id;
    }

    public double getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(double transaction_date) {
        this.transaction_date = transaction_date;
    }

    public float getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(float order_amount) {
        this.order_amount = order_amount;
    }
}
