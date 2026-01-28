package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.BudgetItemAttribute;
import com.monash.erp.oms.repository.BudgetItemAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetItemAttributeService {

    private final BudgetItemAttributeRepository repository;

    public BudgetItemAttributeService(BudgetItemAttributeRepository repository) {
        this.repository = repository;
    }

    public List<BudgetItemAttribute> list() {
        return repository.findAll();
    }

    public BudgetItemAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItemAttribute %d not found".formatted(id)));
    }

    public BudgetItemAttribute create(BudgetItemAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetItemAttribute update(Long id, BudgetItemAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItemAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}