package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortPartLocation;
import com.monash.erp.mfg.repository.WorkEffortPartLocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortPartLocationService {

    private final WorkEffortPartLocationRepository repository;

    public WorkEffortPartLocationService(WorkEffortPartLocationRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortPartLocation> list() {
        return repository.findAll();
    }

    public WorkEffortPartLocation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortPartLocation %d not found".formatted(id)));
    }

    public WorkEffortPartLocation create(WorkEffortPartLocation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortPartLocation update(Long id, WorkEffortPartLocation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortPartLocation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}