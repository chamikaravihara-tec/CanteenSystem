package CanteenSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private int order_id;
    private long user_id;
    private long item_id;
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

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
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
