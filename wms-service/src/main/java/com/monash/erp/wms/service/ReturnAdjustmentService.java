package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnAdjustment;
import com.monash.erp.wms.repository.ReturnAdjustmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnAdjustmentService {

    private final ReturnAdjustmentRepository repository;

    public ReturnAdjustmentService(ReturnAdjustmentRepository repository) {
        this.repository = repository;
    }

    public List<ReturnAdjustment> list() {
        return repository.findAll();
    }

    public ReturnAdjustment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnAdjustment %d not found".formatted(id)));
    }

    public ReturnAdjustment create(ReturnAdjustment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnAdjustment update(Long id, ReturnAdjustment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnAdjustment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}