package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BudgetItemType;
import com.example.erp.oms.accounting.repository.BudgetItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetItemTypeService {

    private final BudgetItemTypeRepository repository;

    public BudgetItemTypeService(BudgetItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<BudgetItemType> list() {
        return repository.findAll();
    }

    public BudgetItemType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItemType %d not found".formatted(id)));
    }

    public BudgetItemType create(BudgetItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetItemType update(Long id, BudgetItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
