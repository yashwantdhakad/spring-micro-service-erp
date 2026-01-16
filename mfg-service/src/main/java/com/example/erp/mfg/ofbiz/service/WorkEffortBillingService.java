package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortBilling;
import com.example.erp.mfg.ofbiz.repository.WorkEffortBillingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortBillingService {

    private final WorkEffortBillingRepository repository;

    public WorkEffortBillingService(WorkEffortBillingRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortBilling> list() {
        return repository.findAll();
    }

    public WorkEffortBilling get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortBilling %d not found".formatted(id)));
    }

    public WorkEffortBilling create(WorkEffortBilling entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortBilling update(Long id, WorkEffortBilling entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortBilling %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}