package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortContent;
import com.example.erp.mfg.ofbiz.repository.WorkEffortContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortContentService {

    private final WorkEffortContentRepository repository;

    public WorkEffortContentService(WorkEffortContentRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortContent> list() {
        return repository.findAll();
    }

    public WorkEffortContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContent %d not found".formatted(id)));
    }

    public WorkEffortContent create(WorkEffortContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortContent update(Long id, WorkEffortContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}