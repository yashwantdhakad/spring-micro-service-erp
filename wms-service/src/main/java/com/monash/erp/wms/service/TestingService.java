package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Testing;
import com.monash.erp.wms.repository.TestingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestingService {

    private final TestingRepository repository;

    public TestingService(TestingRepository repository) {
        this.repository = repository;
    }

    public List<Testing> list() {
        return repository.findAll();
    }

    public Testing get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Testing %d not found".formatted(id)));
    }

    public Testing create(Testing entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Testing update(Long id, Testing entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Testing %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}