package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityHistory;
import com.monash.erp.wms.repository.SalesOpportunityHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityHistoryService {

    private final SalesOpportunityHistoryRepository repository;

    public SalesOpportunityHistoryService(SalesOpportunityHistoryRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityHistory> list() {
        return repository.findAll();
    }

    public SalesOpportunityHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityHistory %d not found".formatted(id)));
    }

    public SalesOpportunityHistory create(SalesOpportunityHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityHistory update(Long id, SalesOpportunityHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}