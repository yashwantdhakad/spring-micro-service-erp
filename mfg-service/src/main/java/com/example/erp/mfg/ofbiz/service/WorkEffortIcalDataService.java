package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.WorkEffortIcalData;
import com.example.erp.mfg.ofbiz.repository.WorkEffortIcalDataRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortIcalDataService {

    private final WorkEffortIcalDataRepository repository;

    public WorkEffortIcalDataService(WorkEffortIcalDataRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortIcalData> list() {
        return repository.findAll();
    }

    public WorkEffortIcalData get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortIcalData %d not found".formatted(id)));
    }

    public WorkEffortIcalData create(WorkEffortIcalData entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortIcalData update(Long id, WorkEffortIcalData entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortIcalData %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}