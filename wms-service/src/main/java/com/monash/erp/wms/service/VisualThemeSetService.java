package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.VisualThemeSet;
import com.monash.erp.wms.repository.VisualThemeSetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VisualThemeSetService {

    private final VisualThemeSetRepository repository;

    public VisualThemeSetService(VisualThemeSetRepository repository) {
        this.repository = repository;
    }

    public List<VisualThemeSet> list() {
        return repository.findAll();
    }

    public VisualThemeSet get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VisualThemeSet %d not found".formatted(id)));
    }

    public VisualThemeSet create(VisualThemeSet entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VisualThemeSet update(Long id, VisualThemeSet entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VisualThemeSet %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}