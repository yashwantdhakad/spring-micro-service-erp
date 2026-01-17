package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentSearchConstraint;
import com.example.erp.wms.ofbiz.repository.ContentSearchConstraintRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentSearchConstraintService {

    private final ContentSearchConstraintRepository repository;

    public ContentSearchConstraintService(ContentSearchConstraintRepository repository) {
        this.repository = repository;
    }

    public List<ContentSearchConstraint> list() {
        return repository.findAll();
    }

    public ContentSearchConstraint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentSearchConstraint %d not found".formatted(id)));
    }

    public ContentSearchConstraint create(ContentSearchConstraint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentSearchConstraint update(Long id, ContentSearchConstraint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentSearchConstraint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}