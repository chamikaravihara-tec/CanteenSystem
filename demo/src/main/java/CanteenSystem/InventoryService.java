package CanteenSystem;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InventoryService {
    @Autowired
    private InventoryRepository repo;

    public List<Inventory> listAll() {
        return repo.findAll();
    }

    public void save(Inventory product) {
        repo.save(product);
    }

    public Inventory get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
