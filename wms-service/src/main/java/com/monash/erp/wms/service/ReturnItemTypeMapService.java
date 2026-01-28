package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnItemTypeMap;
import com.monash.erp.wms.repository.ReturnItemTypeMapRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnItemTypeMapService {

    private final ReturnItemTypeMapRepository repository;

    public ReturnItemTypeMapService(ReturnItemTypeMapRepository repository) {
        this.repository = repository;
    }

    public List<ReturnItemTypeMap> list() {
        return repository.findAll();
    }

    public ReturnItemTypeMap get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemTypeMap %d not found".formatted(id)));
    }

    public ReturnItemTypeMap create(ReturnItemTypeMap entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnItemTypeMap update(Long id, ReturnItemTypeMap entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemTypeMap %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}