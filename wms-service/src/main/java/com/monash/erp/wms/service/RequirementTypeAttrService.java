package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RequirementTypeAttr;
import com.monash.erp.wms.repository.RequirementTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RequirementTypeAttrService {

    private final RequirementTypeAttrRepository repository;

    public RequirementTypeAttrService(RequirementTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<RequirementTypeAttr> list() {
        return repository.findAll();
    }

    public RequirementTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementTypeAttr %d not found".formatted(id)));
    }

    public RequirementTypeAttr create(RequirementTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RequirementTypeAttr update(Long id, RequirementTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RequirementTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}