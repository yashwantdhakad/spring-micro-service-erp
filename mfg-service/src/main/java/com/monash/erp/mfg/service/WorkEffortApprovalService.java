package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortApproval;
import com.monash.erp.mfg.repository.WorkEffortApprovalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortApprovalService {

    private final WorkEffortApprovalRepository repository;

    public WorkEffortApprovalService(WorkEffortApprovalRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortApproval> list() {
        return repository.findAll();
    }

    public WorkEffortApproval get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortApproval %d not found".formatted(id)));
    }

    public WorkEffortApproval create(WorkEffortApproval entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortApproval update(Long id, WorkEffortApproval entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortApproval %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}