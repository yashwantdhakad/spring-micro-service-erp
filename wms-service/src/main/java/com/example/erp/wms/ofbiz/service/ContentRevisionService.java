package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentRevision;
import com.example.erp.wms.ofbiz.repository.ContentRevisionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentRevisionService {

    private final ContentRevisionRepository repository;

    public ContentRevisionService(ContentRevisionRepository repository) {
        this.repository = repository;
    }

    public List<ContentRevision> list() {
        return repository.findAll();
    }

    public ContentRevision get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentRevision %d not found".formatted(id)));
    }

    public ContentRevision create(ContentRevision entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentRevision update(Long id, ContentRevision entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentRevision %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}