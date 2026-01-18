package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyMultiRespColumn;
import com.monash.erp.wms.repository.SurveyMultiRespColumnRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyMultiRespColumnService {

    private final SurveyMultiRespColumnRepository repository;

    public SurveyMultiRespColumnService(SurveyMultiRespColumnRepository repository) {
        this.repository = repository;
    }

    public List<SurveyMultiRespColumn> list() {
        return repository.findAll();
    }

    public SurveyMultiRespColumn get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyMultiRespColumn %d not found".formatted(id)));
    }

    public SurveyMultiRespColumn create(SurveyMultiRespColumn entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyMultiRespColumn update(Long id, SurveyMultiRespColumn entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyMultiRespColumn %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}