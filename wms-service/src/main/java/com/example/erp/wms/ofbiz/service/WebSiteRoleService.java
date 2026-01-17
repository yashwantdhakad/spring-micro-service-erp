package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.WebSiteRole;
import com.example.erp.wms.ofbiz.repository.WebSiteRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WebSiteRoleService {

    private final WebSiteRoleRepository repository;

    public WebSiteRoleService(WebSiteRoleRepository repository) {
        this.repository = repository;
    }

    public List<WebSiteRole> list() {
        return repository.findAll();
    }

    public WebSiteRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSiteRole %d not found".formatted(id)));
    }

    public WebSiteRole create(WebSiteRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WebSiteRole update(Long id, WebSiteRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WebSiteRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}