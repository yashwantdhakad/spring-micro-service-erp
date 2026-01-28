package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.GoogleCoConfiguration;
import com.monash.erp.wms.repository.GoogleCoConfigurationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GoogleCoConfigurationService {

    private final GoogleCoConfigurationRepository repository;

    public GoogleCoConfigurationService(GoogleCoConfigurationRepository repository) {
        this.repository = repository;
    }

    public List<GoogleCoConfiguration> list() {
        return repository.findAll();
    }

    public GoogleCoConfiguration get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GoogleCoConfiguration %d not found".formatted(id)));
    }

    public GoogleCoConfiguration create(GoogleCoConfiguration entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GoogleCoConfiguration update(Long id, GoogleCoConfiguration entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GoogleCoConfiguration %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}