package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.Invoice;
import com.monash.erp.oms.accounting.repository.InvoiceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public List<Invoice> list() {
        return repository.findAll();
    }

    public Invoice get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invoice %d not found".formatted(id)));
    }

    public Invoice create(Invoice entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Invoice update(Long id, Invoice entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invoice %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
