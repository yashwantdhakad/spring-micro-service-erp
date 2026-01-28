package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Visit;
import com.monash.erp.wms.repository.VisitRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VisitService {

    private final VisitRepository repository;

    public VisitService(VisitRepository repository) {
        this.repository = repository;
    }

    public List<Visit> list() {
        return repository.findAll();
    }

    public Visit get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Visit %d not found".formatted(id)));
    }

    public Visit create(Visit entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Visit update(Long id, Visit entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Visit %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}