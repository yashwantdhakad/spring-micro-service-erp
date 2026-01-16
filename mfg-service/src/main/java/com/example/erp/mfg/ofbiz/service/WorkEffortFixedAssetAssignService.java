package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortFixedAssetAssign;
import com.example.erp.mfg.ofbiz.repository.WorkEffortFixedAssetAssignRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortFixedAssetAssignService {

    private final WorkEffortFixedAssetAssignRepository repository;

    public WorkEffortFixedAssetAssignService(WorkEffortFixedAssetAssignRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortFixedAssetAssign> list() {
        return repository.findAll();
    }

    public WorkEffortFixedAssetAssign get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortFixedAssetAssign %d not found".formatted(id)));
    }

    public WorkEffortFixedAssetAssign create(WorkEffortFixedAssetAssign entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortFixedAssetAssign update(Long id, WorkEffortFixedAssetAssign entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortFixedAssetAssign %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}