package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortGoodStandard;
import com.monash.erp.mfg.repository.WorkEffortGoodStandardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortGoodStandardService {

    private final WorkEffortGoodStandardRepository repository;

    public WorkEffortGoodStandardService(WorkEffortGoodStandardRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortGoodStandard> list() {
        return repository.findAll();
    }

    public WorkEffortGoodStandard get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortGoodStandard %d not found".formatted(id)));
    }

    public WorkEffortGoodStandard create(WorkEffortGoodStandard entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortGoodStandard update(Long id, WorkEffortGoodStandard entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortGoodStandard %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}