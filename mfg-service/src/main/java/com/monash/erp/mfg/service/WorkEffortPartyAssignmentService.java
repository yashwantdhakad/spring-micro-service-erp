package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortPartyAssignment;
import com.monash.erp.mfg.repository.WorkEffortPartyAssignmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortPartyAssignmentService {

    private final WorkEffortPartyAssignmentRepository repository;

    public WorkEffortPartyAssignmentService(WorkEffortPartyAssignmentRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortPartyAssignment> list() {
        return repository.findAll();
    }

    public WorkEffortPartyAssignment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortPartyAssignment %d not found".formatted(id)));
    }

    public WorkEffortPartyAssignment create(WorkEffortPartyAssignment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortPartyAssignment update(Long id, WorkEffortPartyAssignment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortPartyAssignment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}