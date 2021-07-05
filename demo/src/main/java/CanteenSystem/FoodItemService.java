package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Blob;
import java.sql.Time;
import java.util.List;

@Service
@Transactional
public class FoodItemService {
    @Autowired
    private FoodItemRepository foodItem_Repository;

    //Create FoodItem
    public boolean addFood(String f_foods_id, String f_intem_id, String f_food_name, String f_type, String f_category, Integer f_quantity, Double f_price, Time f_meal_time, Blob f_image) {
        foodItem_Repository.getNewFoodItem(f_foods_id,f_intem_id,f_food_name,f_type,f_category,f_quantity,f_price,f_meal_time,f_image);
        return true;
    }

    //View All FoodItem
    public List<Food> getAllFood(){
        return foodItem_Repository.getAllFoodItem();
    }

    //Update FoodItem
    public void foodUpdate(String f_foods_id, String f_intem_id, String f_food_name, String f_type, String f_category, Integer f_quantity, Double f_price, Time f_meal_time, Blob f_image){
        foodItem_Repository.getEditFoodItem(f_foods_id,f_intem_id,f_food_name,f_type,f_category,f_quantity,f_price,f_meal_time,f_image);
    }

    //Delete FoodItem
    public void deleteUser(String f_foods_id, String f_intem_id, String f_food_name,Integer f_quantity){
        foodItem_Repository.getDeleteFoodItem(f_foods_id,f_intem_id,f_food_name,f_quantity);
    }
}
