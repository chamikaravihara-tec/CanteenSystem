package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<Food, String> {
}
