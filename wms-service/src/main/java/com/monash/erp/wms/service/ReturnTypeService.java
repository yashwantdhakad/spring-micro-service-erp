package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnType;
import com.monash.erp.wms.repository.ReturnTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnTypeService {

    private final ReturnTypeRepository repository;

    public ReturnTypeService(ReturnTypeRepository repository) {
        this.repository = repository;
    }

    public List<ReturnType> list() {
        return repository.findAll();
    }

    public ReturnType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnType %d not found".formatted(id)));
    }

    public ReturnType create(ReturnType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnType update(Long id, ReturnType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}