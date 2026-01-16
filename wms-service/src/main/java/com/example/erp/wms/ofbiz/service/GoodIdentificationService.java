package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.GoodIdentification;
import com.example.erp.wms.ofbiz.repository.GoodIdentificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GoodIdentificationService {

    private final GoodIdentificationRepository repository;

    public GoodIdentificationService(GoodIdentificationRepository repository) {
        this.repository = repository;
    }

    public List<GoodIdentification> list() {
        return repository.findAll();
    }

    public GoodIdentification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GoodIdentification %d not found".formatted(id)));
    }

    public GoodIdentification create(GoodIdentification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GoodIdentification update(Long id, GoodIdentification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GoodIdentification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}