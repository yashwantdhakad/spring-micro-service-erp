package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyContactMechPurpose;
import com.monash.erp.party.repository.PartyContactMechPurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyContactMechPurposeService {

    private final PartyContactMechPurposeRepository repository;

    public PartyContactMechPurposeService(PartyContactMechPurposeRepository repository) {
        this.repository = repository;
    }

    public List<PartyContactMechPurpose> list() {
        return repository.findAll();
    }

    public PartyContactMechPurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContactMechPurpose %d not found".formatted(id)));
    }

    public PartyContactMechPurpose create(PartyContactMechPurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyContactMechPurpose update(Long id, PartyContactMechPurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContactMechPurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}