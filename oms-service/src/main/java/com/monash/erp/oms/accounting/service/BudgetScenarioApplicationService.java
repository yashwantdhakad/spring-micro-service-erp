package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BudgetScenarioApplication;
import com.monash.erp.oms.accounting.repository.BudgetScenarioApplicationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetScenarioApplicationService {

    private final BudgetScenarioApplicationRepository repository;

    public BudgetScenarioApplicationService(BudgetScenarioApplicationRepository repository) {
        this.repository = repository;
    }

    public List<BudgetScenarioApplication> list() {
        return repository.findAll();
    }

    public BudgetScenarioApplication get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetScenarioApplication %d not found".formatted(id)));
    }

    public BudgetScenarioApplication create(BudgetScenarioApplication entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetScenarioApplication update(Long id, BudgetScenarioApplication entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetScenarioApplication %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
