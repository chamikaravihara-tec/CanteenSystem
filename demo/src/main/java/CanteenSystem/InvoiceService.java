package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InvoiceService {
    @Autowired
    private InvoiceRepository repo;

    public List<Invoice> listAll() {
        return repo.findAll();
    }

    public void save(Invoice invoice) {
        repo.save(invoice);
    }

    public Invoice get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
