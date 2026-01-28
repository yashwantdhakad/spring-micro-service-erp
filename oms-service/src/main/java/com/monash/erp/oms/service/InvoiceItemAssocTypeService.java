package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceItemAssocType;
import com.monash.erp.oms.repository.InvoiceItemAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemAssocTypeService {

    private final InvoiceItemAssocTypeRepository repository;

    public InvoiceItemAssocTypeService(InvoiceItemAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemAssocType> list() {
        return repository.findAll();
    }

    public InvoiceItemAssocType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemAssocType %d not found".formatted(id)));
    }

    public InvoiceItemAssocType create(InvoiceItemAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemAssocType update(Long id, InvoiceItemAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}