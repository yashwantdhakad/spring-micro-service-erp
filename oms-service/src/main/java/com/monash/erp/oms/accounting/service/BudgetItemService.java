package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BudgetItem;
import com.monash.erp.oms.accounting.repository.BudgetItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetItemService {

    private final BudgetItemRepository repository;

    public BudgetItemService(BudgetItemRepository repository) {
        this.repository = repository;
    } 

    public List<BudgetItem> list() {
        return repository.findAll();
    }

    public BudgetItem get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItem %d not found".formatted(id)));
    }

    public BudgetItem create(BudgetItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetItem update(Long id, BudgetItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
