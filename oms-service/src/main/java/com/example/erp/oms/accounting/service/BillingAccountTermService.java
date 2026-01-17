package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BillingAccountTerm;
import com.example.erp.oms.accounting.repository.BillingAccountTermRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BillingAccountTermService {

    private final BillingAccountTermRepository repository;
 
    public BillingAccountTermService(BillingAccountTermRepository repository) {
        this.repository = repository;
    }

    public List<BillingAccountTerm> list() {
        return repository.findAll();
    }

    public BillingAccountTerm get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccountTerm %d not found".formatted(id)));
    }

    public BillingAccountTerm create(BillingAccountTerm entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BillingAccountTerm update(Long id, BillingAccountTerm entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccountTerm %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
