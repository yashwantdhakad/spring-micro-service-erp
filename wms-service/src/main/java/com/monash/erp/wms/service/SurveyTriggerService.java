package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyTrigger;
import com.monash.erp.wms.repository.SurveyTriggerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyTriggerService {

    private final SurveyTriggerRepository repository;

    public SurveyTriggerService(SurveyTriggerRepository repository) {
        this.repository = repository;
    }

    public List<SurveyTrigger> list() {
        return repository.findAll();
    }

    public SurveyTrigger get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyTrigger %d not found".formatted(id)));
    }

    public SurveyTrigger create(SurveyTrigger entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyTrigger update(Long id, SurveyTrigger entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyTrigger %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}