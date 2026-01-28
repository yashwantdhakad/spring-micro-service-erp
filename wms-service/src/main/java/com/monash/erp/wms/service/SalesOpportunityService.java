package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunity;
import com.monash.erp.wms.repository.SalesOpportunityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityService {

    private final SalesOpportunityRepository repository;

    public SalesOpportunityService(SalesOpportunityRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunity> list() {
        return repository.findAll();
    }

    public SalesOpportunity get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunity %d not found".formatted(id)));
    }

    public SalesOpportunity create(SalesOpportunity entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunity update(Long id, SalesOpportunity entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunity %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}