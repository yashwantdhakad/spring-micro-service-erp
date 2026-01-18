package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortCostCalc;
import com.monash.erp.mfg.repository.WorkEffortCostCalcRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortCostCalcService {

    private final WorkEffortCostCalcRepository repository;

    public WorkEffortCostCalcService(WorkEffortCostCalcRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortCostCalc> list() {
        return repository.findAll();
    }

    public WorkEffortCostCalc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortCostCalc %d not found".formatted(id)));
    }

    public WorkEffortCostCalc create(WorkEffortCostCalc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortCostCalc update(Long id, WorkEffortCostCalc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortCostCalc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}