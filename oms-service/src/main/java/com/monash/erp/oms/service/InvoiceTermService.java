package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceTerm;
import com.monash.erp.oms.repository.InvoiceTermRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceTermService {

    private final InvoiceTermRepository repository;

    public InvoiceTermService(InvoiceTermRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceTerm> list() {
        return repository.findAll();
    }

    public InvoiceTerm get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceTerm %d not found".formatted(id)));
    }

    public InvoiceTerm create(InvoiceTerm entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceTerm update(Long id, InvoiceTerm entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceTerm %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}