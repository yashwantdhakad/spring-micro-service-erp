package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TestBlob;
import com.monash.erp.wms.repository.TestBlobRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestBlobService {

    private final TestBlobRepository repository;

    public TestBlobService(TestBlobRepository repository) {
        this.repository = repository;
    }

    public List<TestBlob> list() {
        return repository.findAll();
    }

    public TestBlob get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TestBlob %d not found".formatted(id)));
    }

    public TestBlob create(TestBlob entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TestBlob update(Long id, TestBlob entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TestBlob %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}