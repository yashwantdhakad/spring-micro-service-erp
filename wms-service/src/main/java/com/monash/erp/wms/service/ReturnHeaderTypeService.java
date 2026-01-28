package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnHeaderType;
import com.monash.erp.wms.repository.ReturnHeaderTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnHeaderTypeService {

    private final ReturnHeaderTypeRepository repository;

    public ReturnHeaderTypeService(ReturnHeaderTypeRepository repository) {
        this.repository = repository;
    }

    public List<ReturnHeaderType> list() {
        return repository.findAll();
    }

    public ReturnHeaderType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnHeaderType %d not found".formatted(id)));
    }

    public ReturnHeaderType create(ReturnHeaderType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnHeaderType update(Long id, ReturnHeaderType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnHeaderType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}