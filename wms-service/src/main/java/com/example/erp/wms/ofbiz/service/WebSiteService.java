package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebSite;
import com.example.erp.wms.ofbiz.repository.WebSiteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebSiteService {

    private final WebSiteRepository repository;

    public WebSiteService(WebSiteRepository repository) {
        this.repository = repository;
    }

    public List<WebSite> list() {
        return repository.findAll();
    }
    

    public WebSite get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSite %d not found".formatted(id)));
    }

    public WebSite create(WebSite entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebSite update(Long id, WebSite entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSite %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}