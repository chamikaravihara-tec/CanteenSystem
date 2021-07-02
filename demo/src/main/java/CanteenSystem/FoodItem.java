package CanteenSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.PrivateKey;

@Entity
public class FoodItem {
    private long Food_id;
    private long Item_id;
    private String Food_name;
    private String Food_type;
    private String Category;
    private String Quantity;
    private float Price;
    private String Meal_time;
    private String image;

    protected FoodItem() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return Food_id;
    }

    public long getFood_id() {
        return Food_id;
    }

    public void setFood_id(long food_id) {
        Food_id = food_id;
    }

    public long getItem_id() {
        return Item_id;
    }

    public void setItem_id(long item_id) {
        Item_id = item_id;
    }

    public String getFood_name() {
        return Food_name;
    }

    public void setFood_name(String food_name) {
        Food_name = food_name;
    }

    public String getFood_type() {
        return Food_type;
    }

    public void setFood_type(String food_type) {
        Food_type = food_type;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getMeal_time() {
        return Meal_time;
    }

    public void setMeal_time(String meal_time) {
        Meal_time = meal_time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
