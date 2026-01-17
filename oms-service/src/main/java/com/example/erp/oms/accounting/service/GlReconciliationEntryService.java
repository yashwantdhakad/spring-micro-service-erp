package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlReconciliationEntry;
import com.example.erp.oms.accounting.repository.GlReconciliationEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlReconciliationEntryService {

    private final GlReconciliationEntryRepository repository;

    public GlReconciliationEntryService(GlReconciliationEntryRepository repository) {
        this.repository = repository;
    }

    public List<GlReconciliationEntry> list() {
        return repository.findAll();
    }

    public GlReconciliationEntry get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlReconciliationEntry %d not found".formatted(id)));
    }

    public GlReconciliationEntry create(GlReconciliationEntry entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlReconciliationEntry update(Long id, GlReconciliationEntry entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlReconciliationEntry %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
