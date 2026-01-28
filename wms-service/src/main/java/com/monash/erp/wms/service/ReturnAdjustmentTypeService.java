package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnAdjustmentType;
import com.monash.erp.wms.repository.ReturnAdjustmentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnAdjustmentTypeService {

    private final ReturnAdjustmentTypeRepository repository;

    public ReturnAdjustmentTypeService(ReturnAdjustmentTypeRepository repository) {
        this.repository = repository;
    }

    public List<ReturnAdjustmentType> list() {
        return repository.findAll();
    }

    public ReturnAdjustmentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnAdjustmentType %d not found".formatted(id)));
    }

    public ReturnAdjustmentType create(ReturnAdjustmentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnAdjustmentType update(Long id, ReturnAdjustmentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnAdjustmentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}