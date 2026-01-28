package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortTransBox;
import com.monash.erp.mfg.repository.WorkEffortTransBoxRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortTransBoxService {

    private final WorkEffortTransBoxRepository repository;

    public WorkEffortTransBoxService(WorkEffortTransBoxRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortTransBox> list() {
        return repository.findAll();
    }

    public WorkEffortTransBox get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortTransBox %d not found".formatted(id)));
    }

    public WorkEffortTransBox create(WorkEffortTransBox entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortTransBox update(Long id, WorkEffortTransBox entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortTransBox %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}