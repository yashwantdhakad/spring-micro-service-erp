package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TestingNode;
import com.monash.erp.wms.repository.TestingNodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestingNodeService {

    private final TestingNodeRepository repository;

    public TestingNodeService(TestingNodeRepository repository) {
        this.repository = repository;
    }

    public List<TestingNode> list() {
        return repository.findAll();
    }

    public TestingNode get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingNode %d not found".formatted(id)));
    }

    public TestingNode create(TestingNode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TestingNode update(Long id, TestingNode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingNode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}