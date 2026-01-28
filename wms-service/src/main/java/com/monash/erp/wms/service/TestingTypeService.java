package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TestingType;
import com.monash.erp.wms.repository.TestingTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestingTypeService {

    private final TestingTypeRepository repository;

    public TestingTypeService(TestingTypeRepository repository) {
        this.repository = repository;
    }

    public List<TestingType> list() {
        return repository.findAll();
    }

    public TestingType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingType %d not found".formatted(id)));
    }

    public TestingType create(TestingType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TestingType update(Long id, TestingType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}