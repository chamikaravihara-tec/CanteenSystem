package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TransactionService {
    @Autowired
    private TransactionRepository repo;

    public List<Transaction> listAll() {
        return repo.findAll();
    }

    public void save(Transaction transaction) {
        repo.save(transaction);
    }

    public Transaction get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
