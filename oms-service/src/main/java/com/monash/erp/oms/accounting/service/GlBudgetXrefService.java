package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GlBudgetXref;
import com.monash.erp.oms.accounting.repository.GlBudgetXrefRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlBudgetXrefService {

    private final GlBudgetXrefRepository repository;

    public GlBudgetXrefService(GlBudgetXrefRepository repository) {
        this.repository = repository;
    }

    public List<GlBudgetXref> list() {
        return repository.findAll();
    }

    public GlBudgetXref get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlBudgetXref %d not found".formatted(id)));
    }

    public GlBudgetXref create(GlBudgetXref entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlBudgetXref update(Long id, GlBudgetXref entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlBudgetXref %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
