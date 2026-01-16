package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortPurposeType;
import com.example.erp.mfg.ofbiz.repository.WorkEffortPurposeTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortPurposeTypeService {

    private final WorkEffortPurposeTypeRepository repository;

    public WorkEffortPurposeTypeService(WorkEffortPurposeTypeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortPurposeType> list() {
        return repository.findAll();
    }

    public WorkEffortPurposeType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortPurposeType %d not found".formatted(id)));
    }

    public WorkEffortPurposeType create(WorkEffortPurposeType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortPurposeType update(Long id, WorkEffortPurposeType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortPurposeType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}