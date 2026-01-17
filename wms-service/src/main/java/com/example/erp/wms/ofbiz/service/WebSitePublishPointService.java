package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebSitePublishPoint;
import com.example.erp.wms.ofbiz.repository.WebSitePublishPointRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebSitePublishPointService {

    private final WebSitePublishPointRepository repository;

    public WebSitePublishPointService(WebSitePublishPointRepository repository) {
        this.repository = repository;
    }

    public List<WebSitePublishPoint> list() {
        return repository.findAll();
    }

    public WebSitePublishPoint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSitePublishPoint %d not found".formatted(id)));
    }

    public WebSitePublishPoint create(WebSitePublishPoint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebSitePublishPoint update(Long id, WebSitePublishPoint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSitePublishPoint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}