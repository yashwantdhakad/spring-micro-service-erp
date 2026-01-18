package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BudgetType;
import com.monash.erp.oms.accounting.repository.BudgetTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetTypeService {

    private final BudgetTypeRepository repository;

    public BudgetTypeService(BudgetTypeRepository repository) {
        this.repository = repository;
    }

    public List<BudgetType> list() {
        return repository.findAll();
    }

    public BudgetType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetType %d not found".formatted(id)));
    }

    public BudgetType create(BudgetType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetType update(Long id, BudgetType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
