package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortRevision;
import com.monash.erp.mfg.repository.WorkEffortRevisionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortRevisionService {

    private final WorkEffortRevisionRepository repository;

    public WorkEffortRevisionService(WorkEffortRevisionRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortRevision> list() {
        return repository.findAll();
    }

    public WorkEffortRevision get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortRevision %d not found".formatted(id)));
    }

    public WorkEffortRevision create(WorkEffortRevision entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortRevision update(Long id, WorkEffortRevision entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortRevision %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}