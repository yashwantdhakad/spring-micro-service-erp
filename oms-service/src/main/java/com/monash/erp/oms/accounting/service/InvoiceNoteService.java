package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.InvoiceNote;
import com.monash.erp.oms.accounting.repository.InvoiceNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceNoteService {

    private final InvoiceNoteRepository repository;

    public InvoiceNoteService(InvoiceNoteRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceNote> list() {
        return repository.findAll();
    }

    public InvoiceNote get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceNote %d not found".formatted(id)));
    }

    public InvoiceNote create(InvoiceNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceNote update(Long id, InvoiceNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
