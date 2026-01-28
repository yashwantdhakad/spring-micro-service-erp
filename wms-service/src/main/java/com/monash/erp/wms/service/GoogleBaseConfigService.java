package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.GoogleBaseConfig;
import com.monash.erp.wms.repository.GoogleBaseConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GoogleBaseConfigService {

    private final GoogleBaseConfigRepository repository;

    public GoogleBaseConfigService(GoogleBaseConfigRepository repository) {
        this.repository = repository;
    }

    public List<GoogleBaseConfig> list() {
        return repository.findAll();
    }

    public GoogleBaseConfig get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GoogleBaseConfig %d not found".formatted(id)));
    }

    public GoogleBaseConfig create(GoogleBaseConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GoogleBaseConfig update(Long id, GoogleBaseConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GoogleBaseConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}