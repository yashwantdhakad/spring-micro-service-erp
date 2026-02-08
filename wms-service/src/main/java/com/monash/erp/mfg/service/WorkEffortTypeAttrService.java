package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortTypeAttr;
import com.monash.erp.mfg.repository.WorkEffortTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortTypeAttrService {

    private final WorkEffortTypeAttrRepository repository;

    public WorkEffortTypeAttrService(WorkEffortTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortTypeAttr> list() {
        return repository.findAll();
    }

    public WorkEffortTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortTypeAttr %d not found".formatted(id)));
    }

    public WorkEffortTypeAttr create(WorkEffortTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortTypeAttr update(Long id, WorkEffortTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}