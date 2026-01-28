package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.VisualTheme;
import com.monash.erp.wms.repository.VisualThemeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VisualThemeService {

    private final VisualThemeRepository repository;

    public VisualThemeService(VisualThemeRepository repository) {
        this.repository = repository;
    }

    public List<VisualTheme> list() {
        return repository.findAll();
    }

    public VisualTheme get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VisualTheme %d not found".formatted(id)));
    }

    public VisualTheme create(VisualTheme entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VisualTheme update(Long id, VisualTheme entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VisualTheme %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}