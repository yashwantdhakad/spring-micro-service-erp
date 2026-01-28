package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.FinAccountType;
import com.monash.erp.oms.repository.FinAccountTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountTypeService {

    private final FinAccountTypeRepository repository;

    public FinAccountTypeService(FinAccountTypeRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountType> list() {
        return repository.findAll();
    }

    public FinAccountType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountType %d not found".formatted(id)));
    }

    public FinAccountType create(FinAccountType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountType update(Long id, FinAccountType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}