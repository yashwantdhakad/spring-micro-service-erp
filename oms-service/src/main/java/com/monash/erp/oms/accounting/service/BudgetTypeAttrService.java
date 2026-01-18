package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BudgetTypeAttr;
import com.monash.erp.oms.accounting.repository.BudgetTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetTypeAttrService {

    private final BudgetTypeAttrRepository repository;

    public BudgetTypeAttrService(BudgetTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<BudgetTypeAttr> list() {
        return repository.findAll();
    }

    public BudgetTypeAttr get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetTypeAttr %d not found".formatted(id)));
    }

    public BudgetTypeAttr create(BudgetTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetTypeAttr update(Long id, BudgetTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
