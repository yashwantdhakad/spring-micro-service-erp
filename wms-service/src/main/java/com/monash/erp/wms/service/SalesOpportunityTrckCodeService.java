package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalesOpportunityTrckCode;
import com.monash.erp.wms.repository.SalesOpportunityTrckCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalesOpportunityTrckCodeService {

    private final SalesOpportunityTrckCodeRepository repository;

    public SalesOpportunityTrckCodeService(SalesOpportunityTrckCodeRepository repository) {
        this.repository = repository;
    }

    public List<SalesOpportunityTrckCode> list() {
        return repository.findAll();
    }

    public SalesOpportunityTrckCode get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityTrckCode %d not found".formatted(id)));
    }

    public SalesOpportunityTrckCode create(SalesOpportunityTrckCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalesOpportunityTrckCode update(Long id, SalesOpportunityTrckCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalesOpportunityTrckCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}