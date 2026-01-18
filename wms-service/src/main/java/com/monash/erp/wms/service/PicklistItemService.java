package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PicklistItem;
import com.monash.erp.wms.repository.PicklistItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PicklistItemService {

    private final PicklistItemRepository repository;

    public PicklistItemService(PicklistItemRepository repository) {
        this.repository = repository;
    }

    public List<PicklistItem> list() {
        return repository.findAll();
    }

    public PicklistItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistItem %d not found".formatted(id)));
    }

    public PicklistItem create(PicklistItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PicklistItem update(Long id, PicklistItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}