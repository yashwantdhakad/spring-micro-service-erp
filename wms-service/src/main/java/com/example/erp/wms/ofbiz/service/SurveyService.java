package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.Survey;
import com.example.erp.wms.ofbiz.repository.SurveyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyService {

    private final SurveyRepository repository;

    public SurveyService(SurveyRepository repository) {
        this.repository = repository;
    }

    public List<Survey> list() {
        return repository.findAll();
    }

    public Survey get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Survey %d not found".formatted(id)));
    }

    public Survey create(Survey entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Survey update(Long id, Survey entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Survey %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}