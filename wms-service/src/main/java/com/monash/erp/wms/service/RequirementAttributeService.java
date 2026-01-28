package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementAttribute;
import com.monash.erp.wms.repository.RequirementAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementAttributeService {

    private final RequirementAttributeRepository repository;

    public RequirementAttributeService(RequirementAttributeRepository repository) {
        this.repository = repository;
    }

    public List<RequirementAttribute> list() {
        return repository.findAll();
    }

    public RequirementAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementAttribute %d not found".formatted(id)));
    }

    public RequirementAttribute create(RequirementAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementAttribute update(Long id, RequirementAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}