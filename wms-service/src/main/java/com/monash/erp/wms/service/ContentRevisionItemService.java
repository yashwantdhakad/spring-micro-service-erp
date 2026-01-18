package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContentRevisionItem;
import com.monash.erp.wms.repository.ContentRevisionItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentRevisionItemService {

    private final ContentRevisionItemRepository repository;

    public ContentRevisionItemService(ContentRevisionItemRepository repository) {
        this.repository = repository;
    }

    public List<ContentRevisionItem> list() {
        return repository.findAll();
    }

    public ContentRevisionItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentRevisionItem %d not found".formatted(id)));
    }

    public ContentRevisionItem create(ContentRevisionItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentRevisionItem update(Long id, ContentRevisionItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentRevisionItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}