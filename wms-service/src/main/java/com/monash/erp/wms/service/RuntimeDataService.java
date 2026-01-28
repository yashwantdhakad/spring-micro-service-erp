package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RuntimeData;
import com.monash.erp.wms.repository.RuntimeDataRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RuntimeDataService {

    private final RuntimeDataRepository repository;

    public RuntimeDataService(RuntimeDataRepository repository) {
        this.repository = repository;
    }

    public List<RuntimeData> list() {
        return repository.findAll();
    }

    public RuntimeData get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RuntimeData %d not found".formatted(id)));
    }

    public RuntimeData create(RuntimeData entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RuntimeData update(Long id, RuntimeData entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RuntimeData %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}