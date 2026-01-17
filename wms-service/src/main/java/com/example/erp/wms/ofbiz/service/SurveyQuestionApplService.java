package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.SurveyQuestionAppl;
import com.example.erp.wms.ofbiz.repository.SurveyQuestionApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyQuestionApplService {

    private final SurveyQuestionApplRepository repository;

    public SurveyQuestionApplService(SurveyQuestionApplRepository repository) {
        this.repository = repository;
    }

    public List<SurveyQuestionAppl> list() {
        return repository.findAll();
    }

    public SurveyQuestionAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionAppl %d not found".formatted(id)));
    }

    public SurveyQuestionAppl create(SurveyQuestionAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyQuestionAppl update(Long id, SurveyQuestionAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyQuestionAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}