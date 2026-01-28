package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceItemAttribute;
import com.monash.erp.oms.repository.InvoiceItemAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemAttributeService {

    private final InvoiceItemAttributeRepository repository;

    public InvoiceItemAttributeService(InvoiceItemAttributeRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemAttribute> list() {
        return repository.findAll();
    }

    public InvoiceItemAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemAttribute %d not found".formatted(id)));
    }

    public InvoiceItemAttribute create(InvoiceItemAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemAttribute update(Long id, InvoiceItemAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}