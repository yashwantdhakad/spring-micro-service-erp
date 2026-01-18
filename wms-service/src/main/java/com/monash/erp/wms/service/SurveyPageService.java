package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyPage;
import com.monash.erp.wms.repository.SurveyPageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyPageService {

    private final SurveyPageRepository repository;

    public SurveyPageService(SurveyPageRepository repository) {
        this.repository = repository;
    }

    public List<SurveyPage> list() {
        return repository.findAll();
    }

    public SurveyPage get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyPage %d not found".formatted(id)));
    }

    public SurveyPage create(SurveyPage entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyPage update(Long id, SurveyPage entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyPage %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}