package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentAssocPredicate;
import com.example.erp.wms.ofbiz.repository.ContentAssocPredicateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentAssocPredicateService {

    private final ContentAssocPredicateRepository repository;

    public ContentAssocPredicateService(ContentAssocPredicateRepository repository) {
        this.repository = repository;
    }

    public List<ContentAssocPredicate> list() {
        return repository.findAll();
    }

    public ContentAssocPredicate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentAssocPredicate %d not found".formatted(id)));
    }

    public ContentAssocPredicate create(ContentAssocPredicate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentAssocPredicate update(Long id, ContentAssocPredicate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentAssocPredicate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}