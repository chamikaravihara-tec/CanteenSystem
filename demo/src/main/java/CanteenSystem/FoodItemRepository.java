package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.transaction.Transactional;
import java.sql.Blob;
import java.sql.Time;
import java.util.List;

public interface FoodItemRepository extends JpaRepository<Food, String> {

    //Insert food Item
    @Transactional
    @Procedure(procedureName = "")
    void getNewFoodItem(String foods_id, String intem_id, String food_name, String type, String category, Integer quantity, Double price, Time meal_time, Blob image);

    //Get All Food Item
    @Query(value = "SELECT * FROM //", nativeQuery = true)
    List<Food> getAllFoodItem();

    //Update Food Item
    @Transactional
    @Procedure(procedureName = "")
    void getEditFoodItem(String foods_id,String intem_id,String food_name,String type,String category,Integer quantity,Double price,Time meal_time,Blob image);

    //Delete Food Item
    @Transactional
    @Procedure(procedureName = "")
    void getDeleteFoodItem(String foods_id,String intem_id,String food_name,String type,Integer quantity);
}
