package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyQuestionType;
import com.monash.erp.wms.repository.SurveyQuestionTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyQuestionTypeService {

    private final SurveyQuestionTypeRepository repository;

    public SurveyQuestionTypeService(SurveyQuestionTypeRepository repository) {
        this.repository = repository;
    }

    public List<SurveyQuestionType> list() {
        return repository.findAll();
    }

    public SurveyQuestionType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionType %d not found".formatted(id)));
    }

    public SurveyQuestionType create(SurveyQuestionType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyQuestionType update(Long id, SurveyQuestionType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}