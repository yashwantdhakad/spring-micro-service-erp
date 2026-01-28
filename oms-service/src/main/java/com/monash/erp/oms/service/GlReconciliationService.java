package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GlReconciliation;
import com.monash.erp.oms.repository.GlReconciliationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlReconciliationService {

    private final GlReconciliationRepository repository;

    public GlReconciliationService(GlReconciliationRepository repository) {
        this.repository = repository;
    }

    public List<GlReconciliation> list() {
        return repository.findAll();
    }

    public GlReconciliation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlReconciliation %d not found".formatted(id)));
    }

    public GlReconciliation create(GlReconciliation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlReconciliation update(Long id, GlReconciliation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlReconciliation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}