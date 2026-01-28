package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortAssocAttribute;
import com.monash.erp.mfg.repository.WorkEffortAssocAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortAssocAttributeService {

    private final WorkEffortAssocAttributeRepository repository;

    public WorkEffortAssocAttributeService(WorkEffortAssocAttributeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortAssocAttribute> list() {
        return repository.findAll();
    }

    public WorkEffortAssocAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssocAttribute %d not found".formatted(id)));
    }

    public WorkEffortAssocAttribute create(WorkEffortAssocAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortAssocAttribute update(Long id, WorkEffortAssocAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssocAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}