package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.InvoiceItemType;
import com.example.erp.oms.accounting.repository.InvoiceItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemTypeService {

    private final InvoiceItemTypeRepository repository;

    public InvoiceItemTypeService(InvoiceItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemType> list() {
        return repository.findAll();
    }

    public InvoiceItemType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemType %d not found".formatted(id)));
    }

    public InvoiceItemType create(InvoiceItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemType update(Long id, InvoiceItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
