package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffort;
import com.monash.erp.mfg.repository.WorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortService {

    private final WorkEffortRepository repository;

    public WorkEffortService(WorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffort> list() {
        return repository.findAll();
    }

    public WorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffort %d not found".formatted(id)));
    }

    public WorkEffort create(WorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffort update(Long id, WorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}