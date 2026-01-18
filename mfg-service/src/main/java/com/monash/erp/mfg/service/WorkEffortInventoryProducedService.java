package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortInventoryProduced;
import com.monash.erp.mfg.repository.WorkEffortInventoryProducedRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortInventoryProducedService {

    private final WorkEffortInventoryProducedRepository repository;

    public WorkEffortInventoryProducedService(WorkEffortInventoryProducedRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortInventoryProduced> list() {
        return repository.findAll();
    }

    public WorkEffortInventoryProduced get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInventoryProduced %d not found".formatted(id)));
    }

    public WorkEffortInventoryProduced create(WorkEffortInventoryProduced entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortInventoryProduced update(Long id, WorkEffortInventoryProduced entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInventoryProduced %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}