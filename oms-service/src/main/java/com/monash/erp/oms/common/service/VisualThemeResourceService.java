package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.VisualThemeResource;
import com.monash.erp.oms.common.repository.VisualThemeResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VisualThemeResourceService {

    private final VisualThemeResourceRepository repository;

    public VisualThemeResourceService(VisualThemeResourceRepository repository) {
        this.repository = repository;
    }

    public List<VisualThemeResource> list() {
        return repository.findAll();
    }

    public VisualThemeResource get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VisualThemeResource %d not found".formatted(id)));
    }

    public VisualThemeResource create(VisualThemeResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VisualThemeResource update(Long id, VisualThemeResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VisualThemeResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
