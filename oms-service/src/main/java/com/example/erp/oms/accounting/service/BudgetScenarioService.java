package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BudgetScenario;
import com.example.erp.oms.accounting.repository.BudgetScenarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetScenarioService {

    private final BudgetScenarioRepository repository;

    public BudgetScenarioService(BudgetScenarioRepository repository) {
        this.repository = repository;
    }

    public List<BudgetScenario> list() {
        return repository.findAll();
    }

    public BudgetScenario get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetScenario %d not found".formatted(id)));
    }

    public BudgetScenario create(BudgetScenario entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetScenario update(Long id, BudgetScenario entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetScenario %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
