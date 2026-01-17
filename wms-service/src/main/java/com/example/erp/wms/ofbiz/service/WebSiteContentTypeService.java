package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebSiteContentType;
import com.example.erp.wms.ofbiz.repository.WebSiteContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebSiteContentTypeService {

    private final WebSiteContentTypeRepository repository;

    public WebSiteContentTypeService(WebSiteContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<WebSiteContentType> list() {
        return repository.findAll();
    }

    public WebSiteContentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSiteContentType %d not found".formatted(id)));
    }

    public WebSiteContentType create(WebSiteContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebSiteContentType update(Long id, WebSiteContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSiteContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}