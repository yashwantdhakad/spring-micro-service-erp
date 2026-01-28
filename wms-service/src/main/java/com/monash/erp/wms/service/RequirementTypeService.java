package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementType;
import com.monash.erp.wms.repository.RequirementTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementTypeService {

    private final RequirementTypeRepository repository;

    public RequirementTypeService(RequirementTypeRepository repository) {
        this.repository = repository;
    }

    public List<RequirementType> list() {
        return repository.findAll();
    }

    public RequirementType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementType %d not found".formatted(id)));
    }

    public RequirementType create(RequirementType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementType update(Long id, RequirementType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}