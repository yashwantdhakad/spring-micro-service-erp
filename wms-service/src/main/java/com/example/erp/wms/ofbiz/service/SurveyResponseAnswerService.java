package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.SurveyResponseAnswer;
import com.example.erp.wms.ofbiz.repository.SurveyResponseAnswerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyResponseAnswerService {

    private final SurveyResponseAnswerRepository repository;

    public SurveyResponseAnswerService(SurveyResponseAnswerRepository repository) {
        this.repository = repository;
    }

    public List<SurveyResponseAnswer> list() {
        return repository.findAll();
    }

    public SurveyResponseAnswer get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyResponseAnswer %d not found".formatted(id)));
    }

    public SurveyResponseAnswer create(SurveyResponseAnswer entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyResponseAnswer update(Long id, SurveyResponseAnswer entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyResponseAnswer %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}