package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortSearchConstraint;
import com.monash.erp.mfg.repository.WorkEffortSearchConstraintRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortSearchConstraintService {

    private final WorkEffortSearchConstraintRepository repository;

    public WorkEffortSearchConstraintService(WorkEffortSearchConstraintRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortSearchConstraint> list() {
        return repository.findAll();
    }

    public WorkEffortSearchConstraint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSearchConstraint %d not found".formatted(id)));
    }

    public WorkEffortSearchConstraint create(WorkEffortSearchConstraint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortSearchConstraint update(Long id, WorkEffortSearchConstraint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSearchConstraint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}