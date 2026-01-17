package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebSitePathAlias;
import com.example.erp.wms.ofbiz.repository.WebSitePathAliasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebSitePathAliasService {

    private final WebSitePathAliasRepository repository;

    public WebSitePathAliasService(WebSitePathAliasRepository repository) {
        this.repository = repository;
    }

    public List<WebSitePathAlias> list() {
        return repository.findAll();
    }

    public WebSitePathAlias get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSitePathAlias %d not found".formatted(id)));
    }

    public WebSitePathAlias create(WebSitePathAlias entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebSitePathAlias update(Long id, WebSitePathAlias entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSitePathAlias %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}