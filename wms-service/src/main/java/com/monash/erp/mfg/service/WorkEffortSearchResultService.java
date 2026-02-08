package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortSearchResult;
import com.monash.erp.mfg.repository.WorkEffortSearchResultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortSearchResultService {

    private final WorkEffortSearchResultRepository repository;

    public WorkEffortSearchResultService(WorkEffortSearchResultRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortSearchResult> list() {
        return repository.findAll();
    }

    public WorkEffortSearchResult get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSearchResult %d not found".formatted(id)));
    }

    public WorkEffortSearchResult create(WorkEffortSearchResult entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortSearchResult update(Long id, WorkEffortSearchResult entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSearchResult %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}