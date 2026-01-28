package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ConfigOptionProductOption;
import com.monash.erp.wms.repository.ConfigOptionProductOptionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ConfigOptionProductOptionService {

    private final ConfigOptionProductOptionRepository repository;

    public ConfigOptionProductOptionService(ConfigOptionProductOptionRepository repository) {
        this.repository = repository;
    }

    public List<ConfigOptionProductOption> list() {
        return repository.findAll();
    }

    public ConfigOptionProductOption get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ConfigOptionProductOption %d not found".formatted(id)));
    }

    public ConfigOptionProductOption create(ConfigOptionProductOption entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ConfigOptionProductOption update(Long id, ConfigOptionProductOption entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ConfigOptionProductOption %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}