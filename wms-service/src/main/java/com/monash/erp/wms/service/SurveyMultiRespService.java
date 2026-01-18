package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SurveyMultiResp;
import com.monash.erp.wms.repository.SurveyMultiRespRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SurveyMultiRespService {

    private final SurveyMultiRespRepository repository;

    public SurveyMultiRespService(SurveyMultiRespRepository repository) {
        this.repository = repository;
    }

    public List<SurveyMultiResp> list() {
        return repository.findAll();
    }

    public SurveyMultiResp get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyMultiResp %d not found".formatted(id)));
    }

    public SurveyMultiResp create(SurveyMultiResp entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SurveyMultiResp update(Long id, SurveyMultiResp entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SurveyMultiResp %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}