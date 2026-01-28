package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.InvoiceStatus;
import com.monash.erp.oms.repository.InvoiceStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceStatusService {

    private final InvoiceStatusRepository repository;

    public InvoiceStatusService(InvoiceStatusRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceStatus> list() {
        return repository.findAll();
    }

    public InvoiceStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceStatus %d not found".formatted(id)));
    }

    public InvoiceStatus create(InvoiceStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceStatus update(Long id, InvoiceStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}