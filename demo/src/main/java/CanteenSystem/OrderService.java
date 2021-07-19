package CanteenSystem;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository order_repository;

    //Create Order
    public boolean addOrder(CanteenSystem.Order order) {
        order_repository.save(order);
       return true;
    }

    //View All Orders
    public List<Order> getAllOrders(){
        return order_repository.getAllOrders();
    }

    //Update Order
    public void orderUpdate(String o_order_id, String o_user_id, Double o_total, int o_quantity, Date o_order_date, Time o_order_time, Integer o_item_id){
        order_repository.getEditOrder(o_order_id,o_user_id,o_total,o_quantity,o_order_date,o_order_time,o_item_id);
    }

    //Delete Order
    public void deleteOrder(String o_order_id, String o_user_id,int o_quantity){
        order_repository.getDeleteOrder(o_order_id,o_user_id,o_quantity);
    }
}

