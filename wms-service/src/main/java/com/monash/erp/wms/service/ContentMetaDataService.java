package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContentMetaData;
import com.monash.erp.wms.repository.ContentMetaDataRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentMetaDataService {

    private final ContentMetaDataRepository repository;

    public ContentMetaDataService(ContentMetaDataRepository repository) {
        this.repository = repository;
    }

    public List<ContentMetaData> list() {
        return repository.findAll();
    }

    public ContentMetaData get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentMetaData %d not found".formatted(id)));
    }

    public ContentMetaData create(ContentMetaData entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentMetaData update(Long id, ContentMetaData entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentMetaData %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}