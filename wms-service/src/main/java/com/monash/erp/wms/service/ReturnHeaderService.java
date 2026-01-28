package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnHeader;
import com.monash.erp.wms.repository.ReturnHeaderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnHeaderService {

    private final ReturnHeaderRepository repository;

    public ReturnHeaderService(ReturnHeaderRepository repository) {
        this.repository = repository;
    }

    public List<ReturnHeader> list() {
        return repository.findAll();
    }

    public ReturnHeader get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnHeader %d not found".formatted(id)));
    }

    public ReturnHeader create(ReturnHeader entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnHeader update(Long id, ReturnHeader entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnHeader %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}