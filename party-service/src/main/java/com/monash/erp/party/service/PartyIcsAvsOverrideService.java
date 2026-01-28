package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyIcsAvsOverride;
import com.monash.erp.party.repository.PartyIcsAvsOverrideRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyIcsAvsOverrideService {

    private final PartyIcsAvsOverrideRepository repository;

    public PartyIcsAvsOverrideService(PartyIcsAvsOverrideRepository repository) {
        this.repository = repository;
    }

    public List<PartyIcsAvsOverride> list() {
        return repository.findAll();
    }

    public PartyIcsAvsOverride get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyIcsAvsOverride %d not found".formatted(id)));
    }

    public PartyIcsAvsOverride create(PartyIcsAvsOverride entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyIcsAvsOverride update(Long id, PartyIcsAvsOverride entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyIcsAvsOverride %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}