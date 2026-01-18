package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.InvoiceItem;
import com.monash.erp.oms.accounting.repository.InvoiceItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemService {

    private final InvoiceItemRepository repository;

    public InvoiceItemService(InvoiceItemRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItem> list() {
        return repository.findAll();
    }

    public InvoiceItem get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItem %d not found".formatted(id)));
    }

    public InvoiceItem create(InvoiceItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItem update(Long id, InvoiceItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
