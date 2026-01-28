package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementBudgetAllocation;
import com.monash.erp.wms.repository.RequirementBudgetAllocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementBudgetAllocationService {

    private final RequirementBudgetAllocationRepository repository;

    public RequirementBudgetAllocationService(RequirementBudgetAllocationRepository repository) {
        this.repository = repository;
    }

    public List<RequirementBudgetAllocation> list() {
        return repository.findAll();
    }

    public RequirementBudgetAllocation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementBudgetAllocation %d not found".formatted(id)));
    }

    public RequirementBudgetAllocation create(RequirementBudgetAllocation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementBudgetAllocation update(Long id, RequirementBudgetAllocation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementBudgetAllocation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}