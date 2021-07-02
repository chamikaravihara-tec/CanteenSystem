package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FoodItemService {
    @Autowired
    private FoodItemRepository repo;

    public List<FoodItem> listAll() {
        return repo.findAll();
    }

    public void save(FoodItem foodItem) {
        repo.save(foodItem);
    }

    public FoodItem get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
