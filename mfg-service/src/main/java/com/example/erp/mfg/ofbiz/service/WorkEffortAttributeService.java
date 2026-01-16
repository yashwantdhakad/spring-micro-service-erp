package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortAttribute;
import com.example.erp.mfg.ofbiz.repository.WorkEffortAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortAttributeService {

    private final WorkEffortAttributeRepository repository;

    public WorkEffortAttributeService(WorkEffortAttributeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortAttribute> list() {
        return repository.findAll();
    }

    public WorkEffortAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAttribute %d not found".formatted(id)));
    }

    public WorkEffortAttribute create(WorkEffortAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortAttribute update(Long id, WorkEffortAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}