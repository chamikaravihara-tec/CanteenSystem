package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository repo;

    public List<Order> listAll() {
        return repo.findAll();
    }

    public void save(Order order) {
        repo.save(order);
    }

    public Order get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

