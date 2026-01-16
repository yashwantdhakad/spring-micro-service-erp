package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortAssoc;
import com.example.erp.mfg.ofbiz.repository.WorkEffortAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortAssocService {

    private final WorkEffortAssocRepository repository;

    public WorkEffortAssocService(WorkEffortAssocRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortAssoc> list() {
        return repository.findAll();
    }

    public WorkEffortAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssoc %d not found".formatted(id)));
    }

    public WorkEffortAssoc create(WorkEffortAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortAssoc update(Long id, WorkEffortAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}