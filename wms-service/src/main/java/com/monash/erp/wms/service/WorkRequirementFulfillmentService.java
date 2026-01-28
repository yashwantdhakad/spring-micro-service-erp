package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WorkRequirementFulfillment;
import com.monash.erp.wms.repository.WorkRequirementFulfillmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkRequirementFulfillmentService {

    private final WorkRequirementFulfillmentRepository repository;

    public WorkRequirementFulfillmentService(WorkRequirementFulfillmentRepository repository) {
        this.repository = repository;
    }

    public List<WorkRequirementFulfillment> list() {
        return repository.findAll();
    }

    public WorkRequirementFulfillment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkRequirementFulfillment %d not found".formatted(id)));
    }

    public WorkRequirementFulfillment create(WorkRequirementFulfillment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkRequirementFulfillment update(Long id, WorkRequirementFulfillment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkRequirementFulfillment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}