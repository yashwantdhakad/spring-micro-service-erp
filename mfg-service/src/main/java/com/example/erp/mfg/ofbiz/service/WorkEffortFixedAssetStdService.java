package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortFixedAssetStd;
import com.example.erp.mfg.ofbiz.repository.WorkEffortFixedAssetStdRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortFixedAssetStdService {

    private final WorkEffortFixedAssetStdRepository repository;

    public WorkEffortFixedAssetStdService(WorkEffortFixedAssetStdRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortFixedAssetStd> list() {
        return repository.findAll();
    }

    public WorkEffortFixedAssetStd get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortFixedAssetStd %d not found".formatted(id)));
    }

    public WorkEffortFixedAssetStd create(WorkEffortFixedAssetStd entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortFixedAssetStd update(Long id, WorkEffortFixedAssetStd entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortFixedAssetStd %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}