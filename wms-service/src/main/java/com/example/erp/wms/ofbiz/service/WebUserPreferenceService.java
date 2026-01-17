package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebUserPreference;
import com.example.erp.wms.ofbiz.repository.WebUserPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebUserPreferenceService {

    private final WebUserPreferenceRepository repository;

    public WebUserPreferenceService(WebUserPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<WebUserPreference> list() {
        return repository.findAll();
    }

    public WebUserPreference get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebUserPreference %d not found".formatted(id)));
    }

    public WebUserPreference create(WebUserPreference entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebUserPreference update(Long id, WebUserPreference entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebUserPreference %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}