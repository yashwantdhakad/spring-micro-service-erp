package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DesiredFeature;
import com.monash.erp.wms.repository.DesiredFeatureRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DesiredFeatureService {

    private final DesiredFeatureRepository repository;

    public DesiredFeatureService(DesiredFeatureRepository repository) {
        this.repository = repository;
    }

    public List<DesiredFeature> list() {
        return repository.findAll();
    }

    public DesiredFeature get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DesiredFeature %d not found".formatted(id)));
    }

    public DesiredFeature create(DesiredFeature entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DesiredFeature update(Long id, DesiredFeature entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DesiredFeature %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}