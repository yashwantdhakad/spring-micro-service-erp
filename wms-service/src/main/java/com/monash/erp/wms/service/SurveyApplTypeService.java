package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyApplType;
import com.monash.erp.wms.repository.SurveyApplTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyApplTypeService {

    private final SurveyApplTypeRepository repository;

    public SurveyApplTypeService(SurveyApplTypeRepository repository) {
        this.repository = repository;
    }

    public List<SurveyApplType> list() {
        return repository.findAll();
    }

    public SurveyApplType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyApplType %d not found".formatted(id)));
    }

    public SurveyApplType create(SurveyApplType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyApplType update(Long id, SurveyApplType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyApplType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}