package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TestingSubtype;
import com.monash.erp.wms.repository.TestingSubtypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestingSubtypeService {

    private final TestingSubtypeRepository repository;

    public TestingSubtypeService(TestingSubtypeRepository repository) {
        this.repository = repository;
    }

    public List<TestingSubtype> list() {
        return repository.findAll();
    }

    public TestingSubtype get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingSubtype %d not found".formatted(id)));
    }

    public TestingSubtype create(TestingSubtype entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TestingSubtype update(Long id, TestingSubtype entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingSubtype %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}