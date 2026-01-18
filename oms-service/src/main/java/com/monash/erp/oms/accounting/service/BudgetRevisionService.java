package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BudgetRevision;
import com.monash.erp.oms.accounting.repository.BudgetRevisionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetRevisionService {

    private final BudgetRevisionRepository repository;

    public BudgetRevisionService(BudgetRevisionRepository repository) {
        this.repository = repository;
    }

    public List<BudgetRevision> list() {
        return repository.findAll();
    }

    public BudgetRevision get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetRevision %d not found".formatted(id)));
    }

    public BudgetRevision create(BudgetRevision entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetRevision update(Long id, BudgetRevision entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetRevision %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
