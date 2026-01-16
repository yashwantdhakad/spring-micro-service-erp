package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortInvRes;
import com.example.erp.mfg.ofbiz.repository.WorkEffortInvResRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortInvResService {

    private final WorkEffortInvResRepository repository;

    public WorkEffortInvResService(WorkEffortInvResRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortInvRes> list() {
        return repository.findAll();
    }

    public WorkEffortInvRes get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInvRes %d not found".formatted(id)));
    }

    public WorkEffortInvRes create(WorkEffortInvRes entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortInvRes update(Long id, WorkEffortInvRes entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortInvRes %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}