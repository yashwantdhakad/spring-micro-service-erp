package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TestFieldType;
import com.monash.erp.wms.repository.TestFieldTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestFieldTypeService {

    private final TestFieldTypeRepository repository;

    public TestFieldTypeService(TestFieldTypeRepository repository) {
        this.repository = repository;
    }

    public List<TestFieldType> list() {
        return repository.findAll();
    }

    public TestFieldType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TestFieldType %d not found".formatted(id)));
    }

    public TestFieldType create(TestFieldType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TestFieldType update(Long id, TestFieldType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TestFieldType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}