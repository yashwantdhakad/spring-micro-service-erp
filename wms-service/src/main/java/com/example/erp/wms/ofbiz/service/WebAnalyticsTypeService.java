package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebAnalyticsType;
import com.example.erp.wms.ofbiz.repository.WebAnalyticsTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebAnalyticsTypeService {

    private final WebAnalyticsTypeRepository repository;

    public WebAnalyticsTypeService(WebAnalyticsTypeRepository repository) {
        this.repository = repository;
    }

    public List<WebAnalyticsType> list() {
        return repository.findAll();
    }

    public WebAnalyticsType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebAnalyticsType %d not found".formatted(id)));
    }

    public WebAnalyticsType create(WebAnalyticsType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebAnalyticsType update(Long id, WebAnalyticsType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebAnalyticsType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}