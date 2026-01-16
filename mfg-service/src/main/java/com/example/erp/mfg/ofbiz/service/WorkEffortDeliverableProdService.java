package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortDeliverableProd;
import com.example.erp.mfg.ofbiz.repository.WorkEffortDeliverableProdRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortDeliverableProdService {

    private final WorkEffortDeliverableProdRepository repository;

    public WorkEffortDeliverableProdService(WorkEffortDeliverableProdRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortDeliverableProd> list() {
        return repository.findAll();
    }

    public WorkEffortDeliverableProd get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortDeliverableProd %d not found".formatted(id)));
    }

    public WorkEffortDeliverableProd create(WorkEffortDeliverableProd entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortDeliverableProd update(Long id, WorkEffortDeliverableProd entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortDeliverableProd %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}