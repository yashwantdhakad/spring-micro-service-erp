package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityWorkEffort;
import com.monash.erp.wms.repository.SalesOpportunityWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityWorkEffortService {

    private final SalesOpportunityWorkEffortRepository repository;

    public SalesOpportunityWorkEffortService(SalesOpportunityWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityWorkEffort> list() {
        return repository.findAll();
    }

    public SalesOpportunityWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityWorkEffort %d not found".formatted(id)));
    }

    public SalesOpportunityWorkEffort create(SalesOpportunityWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityWorkEffort update(Long id, SalesOpportunityWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}