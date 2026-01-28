package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceItemTypeAttr;
import com.monash.erp.oms.repository.InvoiceItemTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceItemTypeAttrService {

    private final InvoiceItemTypeAttrRepository repository;

    public InvoiceItemTypeAttrService(InvoiceItemTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceItemTypeAttr> list() {
        return repository.findAll();
    }

    public InvoiceItemTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemTypeAttr %d not found".formatted(id)));
    }

    public InvoiceItemTypeAttr create(InvoiceItemTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceItemTypeAttr update(Long id, InvoiceItemTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceItemTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}