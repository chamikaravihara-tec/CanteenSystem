package CanteenSystem;

import javax.persistence.Entity;

@Entity
public class Order {
    private long Order_id;
    private long User_id;
    private double price;
    private int quantity;
    private double Order_date;
    private double Order_time;

    public long getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(long order_id) {
        Order_id = order_id;
    }

    public long getUser_id() {
        return User_id;
    }

    public void setUser_id(long user_id) {
        User_id = user_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOrder_date() {
        return Order_date;
    }

    public void setOrder_date(double order_date) {
        Order_date = order_date;
    }

    public double getOrder_time() {
        return Order_time;
    }

    public void setOrder_time(double order_time) {
        Order_time = order_time;
    }
}
