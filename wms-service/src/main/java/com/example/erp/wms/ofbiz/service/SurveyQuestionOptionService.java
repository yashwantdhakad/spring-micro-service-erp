package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.SurveyQuestionOption;
import com.example.erp.wms.ofbiz.repository.SurveyQuestionOptionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyQuestionOptionService {

    private final SurveyQuestionOptionRepository repository;

    public SurveyQuestionOptionService(SurveyQuestionOptionRepository repository) {
        this.repository = repository;
    }

    public List<SurveyQuestionOption> list() {
        return repository.findAll();
    }

    public SurveyQuestionOption get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionOption %d not found".formatted(id)));
    }

    public SurveyQuestionOption create(SurveyQuestionOption entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyQuestionOption update(Long id, SurveyQuestionOption entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionOption %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}