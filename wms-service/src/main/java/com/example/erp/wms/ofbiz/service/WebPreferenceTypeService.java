package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebPreferenceType;
import com.example.erp.wms.ofbiz.repository.WebPreferenceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebPreferenceTypeService {

    private final WebPreferenceTypeRepository repository;

    public WebPreferenceTypeService(WebPreferenceTypeRepository repository) {
        this.repository = repository;
    }

    public List<WebPreferenceType> list() {
        return repository.findAll();
    }

    public WebPreferenceType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebPreferenceType %d not found".formatted(id)));
    }

    public WebPreferenceType create(WebPreferenceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebPreferenceType update(Long id, WebPreferenceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebPreferenceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}