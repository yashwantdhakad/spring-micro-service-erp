package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Able015V2;
import com.monash.erp.wms.repository.Able015V2Repository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class Able015V2Service {

    private final Able015V2Repository repository;

    public Able015V2Service(Able015V2Repository repository) {
        this.repository = repository;
    }

    public List<Able015V2> list() {
        return repository.findAll();
    }

    public Able015V2 get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015V2 %d not found".formatted(id)));
    }

    public Able015V2 create(Able015V2 entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Able015V2 update(Long id, Able015V2 entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Able015V2 %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}