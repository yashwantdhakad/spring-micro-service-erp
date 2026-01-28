package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.StatusItem;
import com.monash.erp.oms.repository.StatusItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StatusItemService {

    private final StatusItemRepository repository;

    public StatusItemService(StatusItemRepository repository) {
        this.repository = repository;
    }

    public List<StatusItem> list() {
        return repository.findAll();
    }

    public StatusItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "StatusItem %d not found".formatted(id)));
    }

    public StatusItem create(StatusItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public StatusItem update(Long id, StatusItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "StatusItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}