package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.transaction.Transactional;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    //Insert Item
    //@Transactional
    //@Procedure(procedureName = "")
    //void getNewTransaction(Integer transaction_id,order_id,intem_id,transaction_date,order_amount);

    //Get All Items
    //@Query(value = "SELECT * FROM //", nativeQuery = true)
    //List<Inventory> getAllTransaction();

    //Update Items
   // @Transactional
   // @Procedure(procedureName = "")
    //void getEditTransaction(Integer transaction_id,order_id,intem_id,transaction_date,order_amount);

    //Delete Items
    //@Transactional
    //@Procedure(procedureName = "")
    //void getDeleteTransaction(Integer transaction_id,order_id,intem_id);
}
