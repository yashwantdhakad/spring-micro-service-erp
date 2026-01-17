package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DocumentAttribute;
import com.example.erp.wms.ofbiz.repository.DocumentAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DocumentAttributeService {

    private final DocumentAttributeRepository repository;

    public DocumentAttributeService(DocumentAttributeRepository repository) {
        this.repository = repository;
    }

    public List<DocumentAttribute> list() {
        return repository.findAll();
    }

    public DocumentAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DocumentAttribute %d not found".formatted(id)));
    }

    public DocumentAttribute create(DocumentAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DocumentAttribute update(Long id, DocumentAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DocumentAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}