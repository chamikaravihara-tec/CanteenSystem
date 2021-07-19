package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    //Insert Order
    @Transactional
    @Procedure(procedureName = "")
    void getNewOrder(String order_id, String user_id, Double total, int quantity, Date order_date, Time order_time, Integer item_id);

    //Get All Orders
    @Query(value = "SELECT * FROM display_orders", nativeQuery = true)
    List<org.hibernate.criterion.Order> getAllOrders();

    //Update Order
    @Transactional
    @Procedure(procedureName = "update_orders")
    void getEditOrder(String order_id, String user_id, Double total, int quantity, Date order_date, Time order_time, Integer item_id);

    //Delete Order
    @Transactional
    @Procedure(procedureName = "")
    void getDeleteOrder(String order_id, String user_id,int quantity);

    
}


