package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnItemType;
import com.monash.erp.wms.repository.ReturnItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnItemTypeService {

    private final ReturnItemTypeRepository repository;

    public ReturnItemTypeService(ReturnItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<ReturnItemType> list() {
        return repository.findAll();
    }

    public ReturnItemType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemType %d not found".formatted(id)));
    }

    public ReturnItemType create(ReturnItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnItemType update(Long id, ReturnItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}