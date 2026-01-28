package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementStatus;
import com.monash.erp.wms.repository.RequirementStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementStatusService {

    private final RequirementStatusRepository repository;

    public RequirementStatusService(RequirementStatusRepository repository) {
        this.repository = repository;
    }

    public List<RequirementStatus> list() {
        return repository.findAll();
    }

    public RequirementStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementStatus %d not found".formatted(id)));
    }

    public RequirementStatus create(RequirementStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementStatus update(Long id, RequirementStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}