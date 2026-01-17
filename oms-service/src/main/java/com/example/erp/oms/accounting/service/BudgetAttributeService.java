package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.BudgetAttribute;
import com.example.erp.oms.accounting.repository.BudgetAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetAttributeService {

    private final BudgetAttributeRepository repository;

    public BudgetAttributeService(BudgetAttributeRepository repository) {
        this.repository = repository;
    }
 
    public List<BudgetAttribute> list() {
        return repository.findAll();
    }

    public BudgetAttribute get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetAttribute %d not found".formatted(id)));
    }

    public BudgetAttribute create(BudgetAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetAttribute update(Long id, BudgetAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
