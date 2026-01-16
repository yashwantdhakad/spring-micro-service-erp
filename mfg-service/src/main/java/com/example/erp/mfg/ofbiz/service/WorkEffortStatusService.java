package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortStatus;
import com.example.erp.mfg.ofbiz.repository.WorkEffortStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortStatusService {

    private final WorkEffortStatusRepository repository;

    public WorkEffortStatusService(WorkEffortStatusRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortStatus> list() {
        return repository.findAll();
    }

    public WorkEffortStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortStatus %d not found".formatted(id)));
    }

    public WorkEffortStatus create(WorkEffortStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortStatus update(Long id, WorkEffortStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}