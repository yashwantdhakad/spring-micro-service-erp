package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebAnalyticsConfig;
import com.example.erp.wms.ofbiz.repository.WebAnalyticsConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebAnalyticsConfigService {

    private final WebAnalyticsConfigRepository repository;

    public WebAnalyticsConfigService(WebAnalyticsConfigRepository repository) {
        this.repository = repository;
    }

    public List<WebAnalyticsConfig> list() {
        return repository.findAll();
    }

    public WebAnalyticsConfig get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebAnalyticsConfig %d not found".formatted(id)));
    }

    public WebAnalyticsConfig create(WebAnalyticsConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebAnalyticsConfig update(Long id, WebAnalyticsConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebAnalyticsConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}