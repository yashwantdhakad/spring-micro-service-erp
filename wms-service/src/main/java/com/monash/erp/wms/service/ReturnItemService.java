package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnItem;
import com.monash.erp.wms.repository.ReturnItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnItemService {

    private final ReturnItemRepository repository;

    public ReturnItemService(ReturnItemRepository repository) {
        this.repository = repository;
    }

    public List<ReturnItem> list() {
        return repository.findAll();
    }

    public ReturnItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItem %d not found".formatted(id)));
    }

    public ReturnItem create(ReturnItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnItem update(Long id, ReturnItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}