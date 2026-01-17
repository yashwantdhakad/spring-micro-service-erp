package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentKeyword;
import com.example.erp.wms.ofbiz.repository.ContentKeywordRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentKeywordService {

    private final ContentKeywordRepository repository;

    public ContentKeywordService(ContentKeywordRepository repository) {
        this.repository = repository;
    }

    public List<ContentKeyword> list() {
        return repository.findAll();
    }

    public ContentKeyword get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentKeyword %d not found".formatted(id)));
    }

    public ContentKeyword create(ContentKeyword entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentKeyword update(Long id, ContentKeyword entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentKeyword %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}