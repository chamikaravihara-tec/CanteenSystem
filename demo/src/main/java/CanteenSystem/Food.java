package CanteenSystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.PrivateKey;
import java.sql.Blob;
import java.sql.Time;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String foods_id;
    private String intem_id;
    private String food_name;
    private String type;
    private String category;
    private Integer quantity;
    private Double price;
    private Time meal_time;
    private Blob image;

    public String getFoods_id() {
        return foods_id;
    }

    public void setFoods_id(String foods_id) {
        this.foods_id = foods_id;
    }

    public String getIntem_id() {
        return intem_id;
    }

    public void setIntem_id(String intem_id) {
        this.intem_id = intem_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Time getMeal_time() {
        return meal_time;
    }

    public void setMeal_time(Time meal_time) {
        this.meal_time = meal_time;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
