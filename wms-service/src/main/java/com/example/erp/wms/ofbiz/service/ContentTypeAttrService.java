package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentTypeAttr;
import com.example.erp.wms.ofbiz.repository.ContentTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentTypeAttrService {

    private final ContentTypeAttrRepository repository;

    public ContentTypeAttrService(ContentTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<ContentTypeAttr> list() {
        return repository.findAll();
    }

    public ContentTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentTypeAttr %d not found".formatted(id)));
    }

    public ContentTypeAttr create(ContentTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentTypeAttr update(Long id, ContentTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}