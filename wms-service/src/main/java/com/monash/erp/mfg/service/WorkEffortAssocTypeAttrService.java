package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortAssocTypeAttr;
import com.monash.erp.mfg.repository.WorkEffortAssocTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortAssocTypeAttrService {

    private final WorkEffortAssocTypeAttrRepository repository;

    public WorkEffortAssocTypeAttrService(WorkEffortAssocTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortAssocTypeAttr> list() {
        return repository.findAll();
    }

    public WorkEffortAssocTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssocTypeAttr %d not found".formatted(id)));
    }

    public WorkEffortAssocTypeAttr create(WorkEffortAssocTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortAssocTypeAttr update(Long id, WorkEffortAssocTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortAssocTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}