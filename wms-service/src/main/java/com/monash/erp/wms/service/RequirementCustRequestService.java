package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementCustRequest;
import com.monash.erp.wms.repository.RequirementCustRequestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementCustRequestService {

    private final RequirementCustRequestRepository repository;

    public RequirementCustRequestService(RequirementCustRequestRepository repository) {
        this.repository = repository;
    }

    public List<RequirementCustRequest> list() {
        return repository.findAll();
    }

    public RequirementCustRequest get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementCustRequest %d not found".formatted(id)));
    }

    public RequirementCustRequest create(RequirementCustRequest entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementCustRequest update(Long id, RequirementCustRequest entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementCustRequest %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}