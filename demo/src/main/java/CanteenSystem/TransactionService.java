package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TransactionService {
    @Autowired
    private TransactionRepository Transaction_repository;

    //Create Transaction
    public boolean addTransaction(Integer t_transaction_id, Integer t_order_id, String t_intem_id, Date t_transaction_date,Float t_order_amount) {
        Transaction_repository.getNewTransaction(t_transaction_id,t_order_id,t_intem_id,t_transaction_date,t_order_amount);
       return true;
    }

    //View All Transaction
    public List<Transaction> getAllTransaction(){
        return Transaction_repository.getAllTransaction();
    }

    //Update Transaction
    public void updateTransaction(Integer t_transaction_id, Integer t_order_id, String t_intem_id, Date t_transaction_date,Float t_order_amount){
        Transaction_repository.getEditTransaction(t_transaction_id,t_order_id,t_intem_id,t_transaction_date,t_order_amount);
    }

    //Delete Transaction
    public void deleteTransaction(Integer t_transaction_id, Integer t_order_id, String t_intem_id){
        Transaction_repository.getDeleteTransaction(t_transaction_id,t_order_id,t_intem_id);
    }

}
