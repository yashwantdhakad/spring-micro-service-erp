package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentOperation;
import com.example.erp.wms.ofbiz.repository.ContentOperationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentOperationService {

    private final ContentOperationRepository repository;

    public ContentOperationService(ContentOperationRepository repository) {
        this.repository = repository;
    }

    public List<ContentOperation> list() {
        return repository.findAll();
    }

    public ContentOperation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentOperation %d not found".formatted(id)));
    }

    public ContentOperation create(ContentOperation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentOperation update(Long id, ContentOperation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentOperation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}