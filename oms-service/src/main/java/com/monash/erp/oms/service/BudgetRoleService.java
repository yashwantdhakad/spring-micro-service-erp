package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.BudgetRole;
import com.monash.erp.oms.repository.BudgetRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BudgetRoleService {

    private final BudgetRoleRepository repository;

    public BudgetRoleService(BudgetRoleRepository repository) {
        this.repository = repository;
    }

    public List<BudgetRole> list() {
        return repository.findAll();
    }

    public BudgetRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetRole %d not found".formatted(id)));
    }

    public BudgetRole create(BudgetRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BudgetRole update(Long id, BudgetRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BudgetRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}