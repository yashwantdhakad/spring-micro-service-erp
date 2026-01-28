package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortSkillStandard;
import com.monash.erp.mfg.repository.WorkEffortSkillStandardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortSkillStandardService {

    private final WorkEffortSkillStandardRepository repository;

    public WorkEffortSkillStandardService(WorkEffortSkillStandardRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortSkillStandard> list() {
        return repository.findAll();
    }

    public WorkEffortSkillStandard get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSkillStandard %d not found".formatted(id)));
    }

    public WorkEffortSkillStandard create(WorkEffortSkillStandard entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortSkillStandard update(Long id, WorkEffortSkillStandard entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSkillStandard %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}