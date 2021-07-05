package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {

    //Insert Invoice
    @Transactional
    @Procedure(procedureName = "")
    void getNewInvoice(String invoice_id, String user_id, String food_id, Date invoice_date, Time invoice_time, Double total);

    //Get All Invoice
    @Query(value = "SELECT * FROM display_invoice_details", nativeQuery = true)
    List<Invoice> getAllInvoice();

    //Update Invoice
    @Transactional
    @Procedure(procedureName = "")
    void getEditInvoice(String invoice_id,String user_id,String food_id,Date invoice_date,Time invoice_time,Double total);

    //Delete Invoice
    @Transactional
    @Procedure(procedureName = "")
    void getDeleteInvoice(String invoice_id,String user_id,String food_id);
}
