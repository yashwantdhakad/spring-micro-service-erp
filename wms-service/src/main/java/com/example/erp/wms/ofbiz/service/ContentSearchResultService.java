package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentSearchResult;
import com.example.erp.wms.ofbiz.repository.ContentSearchResultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentSearchResultService {

    private final ContentSearchResultRepository repository;

    public ContentSearchResultService(ContentSearchResultRepository repository) {
        this.repository = repository;
    }

    public List<ContentSearchResult> list() {
        return repository.findAll();
    }

    public ContentSearchResult get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentSearchResult %d not found".formatted(id)));
    }

    public ContentSearchResult create(ContentSearchResult entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentSearchResult update(Long id, ContentSearchResult entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentSearchResult %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}