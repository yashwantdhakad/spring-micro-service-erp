package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyRelationshipType;
import com.monash.erp.party.repository.PartyRelationshipTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyRelationshipTypeService {

    private final PartyRelationshipTypeRepository repository;

    public PartyRelationshipTypeService(PartyRelationshipTypeRepository repository) {
        this.repository = repository;
    }

    public List<PartyRelationshipType> list() {
        return repository.findAll();
    }

    public PartyRelationshipType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRelationshipType %d not found".formatted(id)));
    }

    public PartyRelationshipType create(PartyRelationshipType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyRelationshipType update(Long id, PartyRelationshipType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRelationshipType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}