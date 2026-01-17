package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContentRole;
import com.example.erp.wms.ofbiz.repository.ContentRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContentRoleService {

    private final ContentRoleRepository repository;

    public ContentRoleService(ContentRoleRepository repository) {
        this.repository = repository;
    }

    public List<ContentRole> list() {
        return repository.findAll();
    }

    public ContentRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentRole %d not found".formatted(id)));
    }

    public ContentRole create(ContentRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContentRole update(Long id, ContentRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContentRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}