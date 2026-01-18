package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortType;
import com.monash.erp.mfg.repository.WorkEffortTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortTypeService {

    private final WorkEffortTypeRepository repository;

    public WorkEffortTypeService(WorkEffortTypeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortType> list() {
        return repository.findAll();
    }

    public WorkEffortType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortType %d not found".formatted(id)));
    }

    public WorkEffortType create(WorkEffortType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortType update(Long id, WorkEffortType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}