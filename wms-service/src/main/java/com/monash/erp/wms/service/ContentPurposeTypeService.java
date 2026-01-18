package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContentPurposeType;
import com.monash.erp.wms.repository.ContentPurposeTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentPurposeTypeService {

    private final ContentPurposeTypeRepository repository;

    public ContentPurposeTypeService(ContentPurposeTypeRepository repository) {
        this.repository = repository;
    }

    public List<ContentPurposeType> list() {
        return repository.findAll();
    }

    public ContentPurposeType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentPurposeType %d not found".formatted(id)));
    }

    public ContentPurposeType create(ContentPurposeType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentPurposeType update(Long id, ContentPurposeType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentPurposeType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}