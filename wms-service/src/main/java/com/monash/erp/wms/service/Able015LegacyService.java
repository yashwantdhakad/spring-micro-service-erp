package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Able015Legacy;
import com.monash.erp.wms.repository.Able015LegacyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class Able015LegacyService {

    private final Able015LegacyRepository repository;

    public Able015LegacyService(Able015LegacyRepository repository) {
        this.repository = repository;
    }

    public List<Able015Legacy> list() {
        return repository.findAll();
    }

    public Able015Legacy get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015Legacy %d not found".formatted(id)));
    }

    public Able015Legacy create(Able015Legacy entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Able015Legacy update(Long id, Able015Legacy entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015Legacy %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}