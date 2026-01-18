package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortGoodStandardType;
import com.monash.erp.mfg.repository.WorkEffortGoodStandardTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortGoodStandardTypeService {

    private final WorkEffortGoodStandardTypeRepository repository;

    public WorkEffortGoodStandardTypeService(WorkEffortGoodStandardTypeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortGoodStandardType> list() {
        return repository.findAll();
    }

    public WorkEffortGoodStandardType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortGoodStandardType %d not found".formatted(id)));
    }

    public WorkEffortGoodStandardType create(WorkEffortGoodStandardType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortGoodStandardType update(Long id, WorkEffortGoodStandardType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortGoodStandardType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}