package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceItemTypeGlAccount;
import com.monash.erp.oms.repository.InvoiceItemTypeGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemTypeGlAccountService {

    private final InvoiceItemTypeGlAccountRepository repository;

    public InvoiceItemTypeGlAccountService(InvoiceItemTypeGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemTypeGlAccount> list() {
        return repository.findAll();
    }

    public InvoiceItemTypeGlAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemTypeGlAccount %d not found".formatted(id)));
    }

    public InvoiceItemTypeGlAccount create(InvoiceItemTypeGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemTypeGlAccount update(Long id, InvoiceItemTypeGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemTypeGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}