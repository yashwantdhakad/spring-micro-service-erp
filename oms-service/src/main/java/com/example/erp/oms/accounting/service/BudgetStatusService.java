package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BudgetStatus;
import com.example.erp.oms.accounting.repository.BudgetStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetStatusService {

    private final BudgetStatusRepository repository;

    public BudgetStatusService(BudgetStatusRepository repository) {
        this.repository = repository;
    }

    public List<BudgetStatus> list() {
        return repository.findAll();
    }

    public BudgetStatus get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetStatus %d not found".formatted(id)));
    }

    public BudgetStatus create(BudgetStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetStatus update(Long id, BudgetStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
