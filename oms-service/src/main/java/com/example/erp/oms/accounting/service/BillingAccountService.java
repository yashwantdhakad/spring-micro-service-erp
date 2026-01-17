package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BillingAccount;
import com.example.erp.oms.accounting.repository.BillingAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BillingAccountService {

    private final BillingAccountRepository repository;

    public BillingAccountService(BillingAccountRepository repository) {
        this.repository = repository;
    }
 
    public List<BillingAccount> list() {
        return repository.findAll();
    }

    public BillingAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccount %d not found".formatted(id)));
    }

    public BillingAccount create(BillingAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BillingAccount update(Long id, BillingAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
