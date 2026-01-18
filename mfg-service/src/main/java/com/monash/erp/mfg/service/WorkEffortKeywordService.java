package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortKeyword;
import com.monash.erp.mfg.repository.WorkEffortKeywordRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortKeywordService {

    private final WorkEffortKeywordRepository repository;

    public WorkEffortKeywordService(WorkEffortKeywordRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortKeyword> list() {
        return repository.findAll();
    }

    public WorkEffortKeyword get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortKeyword %d not found".formatted(id)));
    }

    public WorkEffortKeyword create(WorkEffortKeyword entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortKeyword update(Long id, WorkEffortKeyword entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortKeyword %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}