package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DepreciationMethod;
import com.monash.erp.wms.repository.DepreciationMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DepreciationMethodService {

    private final DepreciationMethodRepository repository;

    public DepreciationMethodService(DepreciationMethodRepository repository) {
        this.repository = repository;
    }

    public List<DepreciationMethod> list() {
        return repository.findAll();
    }

    public DepreciationMethod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DepreciationMethod %d not found".formatted(id)));
    }

    public DepreciationMethod create(DepreciationMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DepreciationMethod update(Long id, DepreciationMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DepreciationMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}