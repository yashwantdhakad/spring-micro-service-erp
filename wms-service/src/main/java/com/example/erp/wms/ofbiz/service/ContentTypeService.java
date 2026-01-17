package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentType;
import com.example.erp.wms.ofbiz.repository.ContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentTypeService {

    private final ContentTypeRepository repository;

    public ContentTypeService(ContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<ContentType> list() {
        return repository.findAll();
    }

    public ContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentType %d not found".formatted(id)));
    }

    public ContentType create(ContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentType update(Long id, ContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}