package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyQuestionCategory;
import com.monash.erp.wms.repository.SurveyQuestionCategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyQuestionCategoryService {

    private final SurveyQuestionCategoryRepository repository;

    public SurveyQuestionCategoryService(SurveyQuestionCategoryRepository repository) {
        this.repository = repository;
    }

    public List<SurveyQuestionCategory> list() {
        return repository.findAll();
    }

    public SurveyQuestionCategory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionCategory %d not found".formatted(id)));
    }

    public SurveyQuestionCategory create(SurveyQuestionCategory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyQuestionCategory update(Long id, SurveyQuestionCategory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionCategory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}