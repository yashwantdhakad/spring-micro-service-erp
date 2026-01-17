package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BudgetItemTypeAttr;
import com.example.erp.oms.accounting.repository.BudgetItemTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetItemTypeAttrService {

    private final BudgetItemTypeAttrRepository repository;

    public BudgetItemTypeAttrService(BudgetItemTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<BudgetItemTypeAttr> list() {
        return repository.findAll();
    }

    public BudgetItemTypeAttr get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItemTypeAttr %d not found".formatted(id)));
    }

    public BudgetItemTypeAttr create(BudgetItemTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetItemTypeAttr update(Long id, BudgetItemTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetItemTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
