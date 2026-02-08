package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortInventoryAssign;
import com.monash.erp.mfg.repository.WorkEffortInventoryAssignRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortInventoryAssignService {

    private final WorkEffortInventoryAssignRepository repository;

    public WorkEffortInventoryAssignService(WorkEffortInventoryAssignRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortInventoryAssign> list() {
        return repository.findAll();
    }

    public WorkEffortInventoryAssign get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInventoryAssign %d not found".formatted(id)));
    }

    public WorkEffortInventoryAssign create(WorkEffortInventoryAssign entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortInventoryAssign update(Long id, WorkEffortInventoryAssign entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInventoryAssign %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}