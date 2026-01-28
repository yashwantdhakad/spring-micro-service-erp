package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.IntacctFunction;
import com.monash.erp.wms.repository.IntacctFunctionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IntacctFunctionService {

    private final IntacctFunctionRepository repository;

    public IntacctFunctionService(IntacctFunctionRepository repository) {
        this.repository = repository;
    }

    public List<IntacctFunction> list() {
        return repository.findAll();
    }

    public IntacctFunction get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "IntacctFunction %d not found".formatted(id)));
    }

    public IntacctFunction create(IntacctFunction entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public IntacctFunction update(Long id, IntacctFunction entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "IntacctFunction %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}