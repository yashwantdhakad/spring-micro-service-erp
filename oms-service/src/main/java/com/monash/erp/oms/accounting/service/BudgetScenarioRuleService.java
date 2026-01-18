package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BudgetScenarioRule;
import com.monash.erp.oms.accounting.repository.BudgetScenarioRuleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetScenarioRuleService {

    private final BudgetScenarioRuleRepository repository;

    public BudgetScenarioRuleService(BudgetScenarioRuleRepository repository) {
        this.repository = repository;
    }

    public List<BudgetScenarioRule> list() {
        return repository.findAll();
    }

    public BudgetScenarioRule get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetScenarioRule %d not found".formatted(id)));
    }

    public BudgetScenarioRule create(BudgetScenarioRule entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetScenarioRule update(Long id, BudgetScenarioRule entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetScenarioRule %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
