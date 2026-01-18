package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityContent;
import com.monash.erp.wms.repository.FacilityContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityContentService {

    private final FacilityContentRepository repository;

    public FacilityContentService(FacilityContentRepository repository) {
        this.repository = repository;
    }

    public List<FacilityContent> list() {
        return repository.findAll();
    }

    public FacilityContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityContent %d not found".formatted(id)));
    }

    public FacilityContent create(FacilityContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityContent update(Long id, FacilityContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}