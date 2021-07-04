package CanteenSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Integer transaction_id;
    private Integer order_id;
    private String intem_id;
    private Date transaction_date;
    private Float order_amount;
=======
    private int transaction_id;
    private int order_id;
    private long user_id;
    private long item_id;
    private double transaction_date;
    private float order_amount;
>>>>>>> 67ac3bc6c37c55583cb88a989afd30a288265056

    public Integer getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Integer transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

<<<<<<< HEAD
    public String getIntem_id() {
        return intem_id;
    }

    public void setIntem_id(String intem_id) {
        this.intem_id = intem_id;
=======
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
>>>>>>> 67ac3bc6c37c55583cb88a989afd30a288265056
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Float getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(Float order_amount) {
        this.order_amount = order_amount;
    }
}
