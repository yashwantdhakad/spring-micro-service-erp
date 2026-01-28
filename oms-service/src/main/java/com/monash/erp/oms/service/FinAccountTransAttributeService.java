package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.FinAccountTransAttribute;
import com.monash.erp.oms.repository.FinAccountTransAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountTransAttributeService {

    private final FinAccountTransAttributeRepository repository;

    public FinAccountTransAttributeService(FinAccountTransAttributeRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountTransAttribute> list() {
        return repository.findAll();
    }

    public FinAccountTransAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTransAttribute %d not found".formatted(id)));
    }

    public FinAccountTransAttribute create(FinAccountTransAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountTransAttribute update(Long id, FinAccountTransAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTransAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}