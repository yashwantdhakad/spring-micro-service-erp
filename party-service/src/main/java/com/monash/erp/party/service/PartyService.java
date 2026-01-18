package com.monash.erp.party.service;

import com.monash.erp.party.entity.Party;
import com.monash.erp.party.repository.PartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyService {

    private final PartyRepository repository;

    public PartyService(PartyRepository repository) {
        this.repository = repository;
    }

    public List<Party> list() {
        return repository.findAll();
    }

    public Party get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id)));
    }

    public Party create(Party entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Party update(Long id, Party entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}