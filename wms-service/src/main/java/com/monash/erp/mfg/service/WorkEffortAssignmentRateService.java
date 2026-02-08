package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortAssignmentRate;
import com.monash.erp.mfg.repository.WorkEffortAssignmentRateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortAssignmentRateService {

    private final WorkEffortAssignmentRateRepository repository;

    public WorkEffortAssignmentRateService(WorkEffortAssignmentRateRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortAssignmentRate> list() {
        return repository.findAll();
    }

    public WorkEffortAssignmentRate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssignmentRate %d not found".formatted(id)));
    }

    public WorkEffortAssignmentRate create(WorkEffortAssignmentRate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortAssignmentRate update(Long id, WorkEffortAssignmentRate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssignmentRate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}