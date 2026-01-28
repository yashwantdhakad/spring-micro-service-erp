package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CustomMethod;
import com.monash.erp.wms.repository.CustomMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomMethodService {

    private final CustomMethodRepository repository;

    public CustomMethodService(CustomMethodRepository repository) {
        this.repository = repository;
    }

    public List<CustomMethod> list() {
        return repository.findAll();
    }

    public CustomMethod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomMethod %d not found".formatted(id)));
    }

    public CustomMethod create(CustomMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustomMethod update(Long id, CustomMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}