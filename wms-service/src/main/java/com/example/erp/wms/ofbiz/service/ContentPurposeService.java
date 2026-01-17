package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentPurpose;
import com.example.erp.wms.ofbiz.repository.ContentPurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentPurposeService {

    private final ContentPurposeRepository repository;

    public ContentPurposeService(ContentPurposeRepository repository) {
        this.repository = repository;
    }

    public List<ContentPurpose> list() {
        return repository.findAll();
    }

    public ContentPurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentPurpose %d not found".formatted(id)));
    }

    public ContentPurpose create(ContentPurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentPurpose update(Long id, ContentPurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentPurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}