package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyDimension;
import com.monash.erp.party.repository.PartyDimensionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyDimensionService {

    private final PartyDimensionRepository repository;

    public PartyDimensionService(PartyDimensionRepository repository) {
        this.repository = repository;
    }

    public List<PartyDimension> list() {
        return repository.findAll();
    }

    public PartyDimension get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyDimension %d not found".formatted(id)));
    }

    public PartyDimension create(PartyDimension entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyDimension update(Long id, PartyDimension entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyDimension %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}