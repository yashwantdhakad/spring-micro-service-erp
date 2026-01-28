package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceItemTypeMap;
import com.monash.erp.oms.repository.InvoiceItemTypeMapRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemTypeMapService {

    private final InvoiceItemTypeMapRepository repository;

    public InvoiceItemTypeMapService(InvoiceItemTypeMapRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemTypeMap> list() {
        return repository.findAll();
    }

    public InvoiceItemTypeMap get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemTypeMap %d not found".formatted(id)));
    }

    public InvoiceItemTypeMap create(InvoiceItemTypeMap entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemTypeMap update(Long id, InvoiceItemTypeMap entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemTypeMap %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}