package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PicklistStatusHistory;
import com.monash.erp.wms.repository.PicklistStatusHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PicklistStatusHistoryService {

    private final PicklistStatusHistoryRepository repository;

    public PicklistStatusHistoryService(PicklistStatusHistoryRepository repository) {
        this.repository = repository;
    }

    public List<PicklistStatusHistory> list() {
        return repository.findAll();
    }

    public PicklistStatusHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistStatusHistory %d not found".formatted(id)));
    }

    public PicklistStatusHistory create(PicklistStatusHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PicklistStatusHistory update(Long id, PicklistStatusHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistStatusHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}