package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesInvoiceItemFact;
import com.monash.erp.wms.repository.SalesInvoiceItemFactRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesInvoiceItemFactService {

    private final SalesInvoiceItemFactRepository repository;

    public SalesInvoiceItemFactService(SalesInvoiceItemFactRepository repository) {
        this.repository = repository;
    }

    public List<SalesInvoiceItemFact> list() {
        return repository.findAll();
    }

    public SalesInvoiceItemFact get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesInvoiceItemFact %d not found".formatted(id)));
    }

    public SalesInvoiceItemFact create(SalesInvoiceItemFact entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesInvoiceItemFact update(Long id, SalesInvoiceItemFact entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesInvoiceItemFact %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}