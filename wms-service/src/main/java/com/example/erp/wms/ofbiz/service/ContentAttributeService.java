package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentAttribute;
import com.example.erp.wms.ofbiz.repository.ContentAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentAttributeService {

    private final ContentAttributeRepository repository;

    public ContentAttributeService(ContentAttributeRepository repository) {
        this.repository = repository;
    }

    public List<ContentAttribute> list() {
        return repository.findAll();
    }

    public ContentAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentAttribute %d not found".formatted(id)));
    }

    public ContentAttribute create(ContentAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentAttribute update(Long id, ContentAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}