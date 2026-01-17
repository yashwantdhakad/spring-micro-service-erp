package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentPurposeOperation;
import com.example.erp.wms.ofbiz.repository.ContentPurposeOperationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentPurposeOperationService {

    private final ContentPurposeOperationRepository repository;

    public ContentPurposeOperationService(ContentPurposeOperationRepository repository) {
        this.repository = repository;
    }

    public List<ContentPurposeOperation> list() {
        return repository.findAll();
    }

    public ContentPurposeOperation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentPurposeOperation %d not found".formatted(id)));
    }

    public ContentPurposeOperation create(ContentPurposeOperation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentPurposeOperation update(Long id, ContentPurposeOperation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentPurposeOperation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}