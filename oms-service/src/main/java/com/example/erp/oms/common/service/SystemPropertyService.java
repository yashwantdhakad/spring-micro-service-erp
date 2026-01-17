package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.SystemProperty;
import com.example.erp.oms.common.repository.SystemPropertyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SystemPropertyService {

    private final SystemPropertyRepository repository;

    public SystemPropertyService(SystemPropertyRepository repository) {
        this.repository = repository;
    }

    public List<SystemProperty> list() {
        return repository.findAll();
    }

    public SystemProperty get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SystemProperty %d not found".formatted(id)));
    }

    public SystemProperty create(SystemProperty entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SystemProperty update(Long id, SystemProperty entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SystemProperty %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
