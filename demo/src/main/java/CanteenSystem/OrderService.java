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

    public List<orders> listAll() {
        return repo.findAll();
    }

    public void save(orders order) {
        repo.save(order);
    }

    public orders get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}

