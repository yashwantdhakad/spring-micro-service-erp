package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityRole;
import com.monash.erp.wms.repository.SalesOpportunityRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityRoleService {

    private final SalesOpportunityRoleRepository repository;

    public SalesOpportunityRoleService(SalesOpportunityRoleRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityRole> list() {
        return repository.findAll();
    }

    public SalesOpportunityRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityRole %d not found".formatted(id)));
    }

    public SalesOpportunityRole create(SalesOpportunityRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityRole update(Long id, SalesOpportunityRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}