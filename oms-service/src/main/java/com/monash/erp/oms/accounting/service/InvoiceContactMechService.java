package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.InvoiceContactMech;
import com.monash.erp.oms.accounting.repository.InvoiceContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceContactMechService {

    private final InvoiceContactMechRepository repository;

    public InvoiceContactMechService(InvoiceContactMechRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceContactMech> list() {
        return repository.findAll();
    }

    public InvoiceContactMech get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceContactMech %d not found".formatted(id)));
    }

    public InvoiceContactMech create(InvoiceContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceContactMech update(Long id, InvoiceContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
