package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceTermAttribute;
import com.monash.erp.oms.repository.InvoiceTermAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceTermAttributeService {

    private final InvoiceTermAttributeRepository repository;

    public InvoiceTermAttributeService(InvoiceTermAttributeRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceTermAttribute> list() {
        return repository.findAll();
    }

    public InvoiceTermAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceTermAttribute %d not found".formatted(id)));
    }

    public InvoiceTermAttribute create(InvoiceTermAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceTermAttribute update(Long id, InvoiceTermAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceTermAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}