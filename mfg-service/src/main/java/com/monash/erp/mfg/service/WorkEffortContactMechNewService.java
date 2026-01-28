package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortContactMechNew;
import com.monash.erp.mfg.repository.WorkEffortContactMechNewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortContactMechNewService {

    private final WorkEffortContactMechNewRepository repository;

    public WorkEffortContactMechNewService(WorkEffortContactMechNewRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortContactMechNew> list() {
        return repository.findAll();
    }

    public WorkEffortContactMechNew get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContactMechNew %d not found".formatted(id)));
    }

    public WorkEffortContactMechNew create(WorkEffortContactMechNew entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortContactMechNew update(Long id, WorkEffortContactMechNew entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortContactMechNew %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}