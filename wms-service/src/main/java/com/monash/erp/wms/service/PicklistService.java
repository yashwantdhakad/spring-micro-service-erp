package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Picklist;
import com.monash.erp.wms.repository.PicklistRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PicklistService {

    private final PicklistRepository repository;

    public PicklistService(PicklistRepository repository) {
        this.repository = repository;
    }

    public List<Picklist> list() {
        return repository.findAll();
    }

    public Picklist get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Picklist %d not found".formatted(id)));
    }

    public Picklist create(Picklist entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Picklist update(Long id, Picklist entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Picklist %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}