package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.InvoiceAttribute;
import com.example.erp.oms.accounting.repository.InvoiceAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceAttributeService {

    private final InvoiceAttributeRepository repository;

    public InvoiceAttributeService(InvoiceAttributeRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceAttribute> list() {
        return repository.findAll();
    }

    public InvoiceAttribute get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceAttribute %d not found".formatted(id)));
    }

    public InvoiceAttribute create(InvoiceAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceAttribute update(Long id, InvoiceAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
