package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class InvoiceService {
    @Autowired
    private InvoiceRepository invoice_Repository;

    //Create Invoice
    public boolean addInvoice(Invoice invoice) {
        invoice_Repository.save(invoice);
        return true;
    }

    //View All Invoice
    public List<Invoice> getAllInvoice(){
        return invoice_Repository.getAllInvoice();
    }

    //Update Invoice
    public void invoiceUpdate(String i_invoice_id, String i_user_id, String i_food_id, Date i_invoice_date, Time i_invoice_time, Double i_total){
        invoice_Repository.getEditInvoice(i_invoice_id,i_user_id,i_food_id,i_invoice_date,i_invoice_time,i_total);
    }

    //Delete Invoice
    public void deleteInvoice(String i_invoice_id,String i_user_id,String i_food_id){
        invoice_Repository.getDeleteInvoice(i_invoice_id,i_user_id,i_food_id);
    }
}
