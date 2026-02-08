package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortContentType;
import com.monash.erp.mfg.repository.WorkEffortContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortContentTypeService {

    private final WorkEffortContentTypeRepository repository;

    public WorkEffortContentTypeService(WorkEffortContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortContentType> list() {
        return repository.findAll();
    }

    public WorkEffortContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContentType %d not found".formatted(id)));
    }

    public WorkEffortContentType create(WorkEffortContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortContentType update(Long id, WorkEffortContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}