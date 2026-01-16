package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortContactMech;
import com.example.erp.mfg.ofbiz.repository.WorkEffortContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortContactMechService {

    private final WorkEffortContactMechRepository repository;

    public WorkEffortContactMechService(WorkEffortContactMechRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortContactMech> list() {
        return repository.findAll();
    }

    public WorkEffortContactMech get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContactMech %d not found".formatted(id)));
    }

    public WorkEffortContactMech create(WorkEffortContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortContactMech update(Long id, WorkEffortContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}