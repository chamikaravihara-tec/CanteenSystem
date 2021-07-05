package CanteenSystem;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InventoryService {
    @Autowired
    private InventoryRepository inventory_Repository;

    //Create Inventory
    //public boolean addInventory(String in_intem_id, String in_item_name, Integer in_quantity, Double in_price, Date in_expired_date, String in_supplier_name, Date in_supply_date, Date in_manufactured_date, String in_product_name, Blob in_image) {
        //inventory_Repository.getNewProduct(in_intem_id,in_item_name,in_quantity,in_price,in_expired_date,in_supplier_name,in_supply_date,in_manufactured_date,in_product_name,in_image);
        //return true;
    //}

    //View All Inventory
    //public List<Inventory> getAllInventory(){
        //return inventory_Repository.getAllProducts();
    //}

    //Update Inventory
   // public void inventoryUpdate(String in_intem_id, String in_item_name, Integer in_quantity, Double in_price, Date in_expired_date, String in_supplier_name, Date in_supply_date, Date in_manufactured_date, String in_product_name, Blob in_image){
       // inventory_Repository.getEditProduct(in_intem_id,in_item_name,in_quantity,in_price,in_expired_date,in_supplier_name,in_supply_date,in_manufactured_date,in_product_name,in_image);
    //}

    //Delete Inventory
    //public void deleteInventory(String in_intem_id, String in_item_name, Integer in_quantity,String in_supplier_name,String in_product_name){
       // inventory_Repository.getDeleteProduct(in_intem_id,in_item_name,in_quantity,in_supplier_name,in_product_name);
    //}
}
