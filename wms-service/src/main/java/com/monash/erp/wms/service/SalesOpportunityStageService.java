package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityStage;
import com.monash.erp.wms.repository.SalesOpportunityStageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityStageService {

    private final SalesOpportunityStageRepository repository;

    public SalesOpportunityStageService(SalesOpportunityStageRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityStage> list() {
        return repository.findAll();
    }

    public SalesOpportunityStage get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityStage %d not found".formatted(id)));
    }

    public SalesOpportunityStage create(SalesOpportunityStage entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityStage update(Long id, SalesOpportunityStage entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityStage %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}