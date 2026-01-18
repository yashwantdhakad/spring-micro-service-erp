package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyQuestion;
import com.monash.erp.wms.repository.SurveyQuestionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyQuestionService {

    private final SurveyQuestionRepository repository;

    public SurveyQuestionService(SurveyQuestionRepository repository) {
        this.repository = repository;
    }

    public List<SurveyQuestion> list() {
        return repository.findAll();
    }

    public SurveyQuestion get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestion %d not found".formatted(id)));
    }

    public SurveyQuestion create(SurveyQuestion entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyQuestion update(Long id, SurveyQuestion entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestion %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}