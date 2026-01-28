package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortInventoryStandard;
import com.monash.erp.mfg.repository.WorkEffortInventoryStandardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortInventoryStandardService {

    private final WorkEffortInventoryStandardRepository repository;

    public WorkEffortInventoryStandardService(WorkEffortInventoryStandardRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortInventoryStandard> list() {
        return repository.findAll();
    }

    public WorkEffortInventoryStandard get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInventoryStandard %d not found".formatted(id)));
    }

    public WorkEffortInventoryStandard create(WorkEffortInventoryStandard entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortInventoryStandard update(Long id, WorkEffortInventoryStandard entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInventoryStandard %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}