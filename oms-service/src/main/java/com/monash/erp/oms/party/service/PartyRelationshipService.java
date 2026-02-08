package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyRelationship;
import com.monash.erp.oms.party.repository.PartyRelationshipRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyRelationshipService {

    private final PartyRelationshipRepository repository;

    public PartyRelationshipService(PartyRelationshipRepository repository) {
        this.repository = repository;
    }

    public List<PartyRelationship> list() {
        return repository.findAll();
    }

    public PartyRelationship get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRelationship %d not found".formatted(id)));
    }

    public PartyRelationship create(PartyRelationship entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyRelationship update(Long id, PartyRelationship entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRelationship %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}