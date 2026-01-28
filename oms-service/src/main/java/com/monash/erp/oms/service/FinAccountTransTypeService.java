package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.FinAccountTransType;
import com.monash.erp.oms.repository.FinAccountTransTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountTransTypeService {

    private final FinAccountTransTypeRepository repository;

    public FinAccountTransTypeService(FinAccountTransTypeRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountTransType> list() {
        return repository.findAll();
    }

    public FinAccountTransType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTransType %d not found".formatted(id)));
    }

    public FinAccountTransType create(FinAccountTransType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountTransType update(Long id, FinAccountTransType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTransType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}