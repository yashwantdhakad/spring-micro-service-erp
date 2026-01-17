package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.InvoiceTypeAttr;
import com.example.erp.oms.accounting.repository.InvoiceTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceTypeAttrService {

    private final InvoiceTypeAttrRepository repository;

    public InvoiceTypeAttrService(InvoiceTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceTypeAttr> list() {
        return repository.findAll();
    }

    public InvoiceTypeAttr get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceTypeAttr %d not found".formatted(id)));
    }

    public InvoiceTypeAttr create(InvoiceTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceTypeAttr update(Long id, InvoiceTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
