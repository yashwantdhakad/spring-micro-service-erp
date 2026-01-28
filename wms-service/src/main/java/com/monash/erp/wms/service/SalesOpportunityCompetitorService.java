package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityCompetitor;
import com.monash.erp.wms.repository.SalesOpportunityCompetitorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityCompetitorService {

    private final SalesOpportunityCompetitorRepository repository;

    public SalesOpportunityCompetitorService(SalesOpportunityCompetitorRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityCompetitor> list() {
        return repository.findAll();
    }

    public SalesOpportunityCompetitor get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityCompetitor %d not found".formatted(id)));
    }

    public SalesOpportunityCompetitor create(SalesOpportunityCompetitor entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityCompetitor update(Long id, SalesOpportunityCompetitor entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityCompetitor %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}