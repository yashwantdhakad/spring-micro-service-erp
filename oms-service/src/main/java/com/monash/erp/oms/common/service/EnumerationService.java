package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.Enumeration;
import com.monash.erp.oms.common.repository.EnumerationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EnumerationService {

    private final EnumerationRepository repository;

    public EnumerationService(EnumerationRepository repository) {
        this.repository = repository;
    }

    public List<Enumeration> list() {
        return repository.findAll();
    }

    public Enumeration get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Enumeration %d not found".formatted(id)));
    }

    public Enumeration create(Enumeration entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Enumeration update(Long id, Enumeration entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Enumeration %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
