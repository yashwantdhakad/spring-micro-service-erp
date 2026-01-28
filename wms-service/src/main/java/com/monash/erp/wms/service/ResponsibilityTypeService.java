package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ResponsibilityType;
import com.monash.erp.wms.repository.ResponsibilityTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ResponsibilityTypeService {

    private final ResponsibilityTypeRepository repository;

    public ResponsibilityTypeService(ResponsibilityTypeRepository repository) {
        this.repository = repository;
    }

    public List<ResponsibilityType> list() {
        return repository.findAll();
    }

    public ResponsibilityType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ResponsibilityType %d not found".formatted(id)));
    }

    public ResponsibilityType create(ResponsibilityType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ResponsibilityType update(Long id, ResponsibilityType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ResponsibilityType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}