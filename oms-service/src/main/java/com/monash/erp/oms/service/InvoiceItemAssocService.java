package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceItemAssoc;
import com.monash.erp.oms.repository.InvoiceItemAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemAssocService {

    private final InvoiceItemAssocRepository repository;

    public InvoiceItemAssocService(InvoiceItemAssocRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemAssoc> list() {
        return repository.findAll();
    }

    public InvoiceItemAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemAssoc %d not found".formatted(id)));
    }

    public InvoiceItemAssoc create(InvoiceItemAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemAssoc update(Long id, InvoiceItemAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}