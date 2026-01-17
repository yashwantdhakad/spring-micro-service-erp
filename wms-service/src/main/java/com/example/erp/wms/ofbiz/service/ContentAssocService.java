package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentAssoc;
import com.example.erp.wms.ofbiz.repository.ContentAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentAssocService {

    private final ContentAssocRepository repository;

    public ContentAssocService(ContentAssocRepository repository) {
        this.repository = repository;
    }

    public List<ContentAssoc> list() {
        return repository.findAll();
    }

    public ContentAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentAssoc %d not found".formatted(id)));
    }

    public ContentAssoc create(ContentAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentAssoc update(Long id, ContentAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}