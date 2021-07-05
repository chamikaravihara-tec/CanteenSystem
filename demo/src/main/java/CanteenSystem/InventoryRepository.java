package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {

    //Insert Item
    @Transactional
    @Procedure(procedureName = "insert_inventory")
    void getNewProduct(String intem_id, String item_name, Integer quantity, Double price, Date expired_date, String supplier_name, Date supply_date, Date manufactured_date, String product_name, Blob image);

    //Get All Items
    @Query(value = "SELECT * FROM view_inventory", nativeQuery = true)
    List<Inventory> getAllProducts();

    //Update Items
    @Transactional
    @Procedure(procedureName = "update_inventory")
    void getEditProduct(String intem_id,String item_name,Integer quantity,Double price,Date expired_date,String supplier_name,Date supply_date,Date manufactured_date,String product_name,Blob image);

    //Delete Items
    @Transactional
    @Procedure(procedureName = "")
    void getDeleteProduct(String intem_id,String item_name,Integer quantity,String supplier_name);
}
