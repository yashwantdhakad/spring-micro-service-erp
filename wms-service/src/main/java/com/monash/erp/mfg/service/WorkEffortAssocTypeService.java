package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortAssocType;
import com.monash.erp.mfg.repository.WorkEffortAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortAssocTypeService {

    private final WorkEffortAssocTypeRepository repository;

    public WorkEffortAssocTypeService(WorkEffortAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortAssocType> list() {
        return repository.findAll();
    }

    public WorkEffortAssocType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssocType %d not found".formatted(id)));
    }

    public WorkEffortAssocType create(WorkEffortAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortAssocType update(Long id, WorkEffortAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}