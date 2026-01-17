package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.InvoiceContent;
import com.example.erp.oms.accounting.repository.InvoiceContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceContentService {

    private final InvoiceContentRepository repository;

    public InvoiceContentService(InvoiceContentRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceContent> list() {
        return repository.findAll();
    }

    public InvoiceContent get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceContent %d not found".formatted(id)));
    }

    public InvoiceContent create(InvoiceContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceContent update(Long id, InvoiceContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
