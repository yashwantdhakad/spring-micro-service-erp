package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Able015;
import com.monash.erp.wms.repository.Able015Repository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class Able015Service {

    private final Able015Repository repository;

    public Able015Service(Able015Repository repository) {
        this.repository = repository;
    }

    public List<Able015> list() {
        return repository.findAll();
    }

    public Able015 get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015 %d not found".formatted(id)));
    }

    public Able015 create(Able015 entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Able015 update(Long id, Able015 entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015 %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}