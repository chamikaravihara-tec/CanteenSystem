package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<orders, String> {
}
