package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkEffortSurveyAppl;
import com.monash.erp.mfg.repository.WorkEffortSurveyApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkEffortSurveyApplService {

    private final WorkEffortSurveyApplRepository repository;

    public WorkEffortSurveyApplService(WorkEffortSurveyApplRepository repository) {
        this.repository = repository;
    }

    public List<WorkEffortSurveyAppl> list() {
        return repository.findAll();
    }

    public WorkEffortSurveyAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSurveyAppl %d not found".formatted(id)));
    }

    public WorkEffortSurveyAppl create(WorkEffortSurveyAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkEffortSurveyAppl update(Long id, WorkEffortSurveyAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortSurveyAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}