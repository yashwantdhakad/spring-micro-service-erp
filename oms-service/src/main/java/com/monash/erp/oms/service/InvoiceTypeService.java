package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceType;
import com.monash.erp.oms.repository.InvoiceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceTypeService {

    private final InvoiceTypeRepository repository;

    public InvoiceTypeService(InvoiceTypeRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceType> list() {
        return repository.findAll();
    }

    public InvoiceType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceType %d not found".formatted(id)));
    }

    public InvoiceType create(InvoiceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceType update(Long id, InvoiceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}