package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyContactMech;
import com.example.erp.party.ofbiz.repository.PartyContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyContactMechService {

    private final PartyContactMechRepository repository;

    public PartyContactMechService(PartyContactMechRepository repository) {
        this.repository = repository;
    }

    public List<PartyContactMech> list() {
        return repository.findAll();
    }

    public PartyContactMech get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContactMech %d not found".formatted(id)));
    }

    public PartyContactMech create(PartyContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyContactMech update(Long id, PartyContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}