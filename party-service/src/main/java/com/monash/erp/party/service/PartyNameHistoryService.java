package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyNameHistory;
import com.monash.erp.party.repository.PartyNameHistoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyNameHistoryService {

    private final PartyNameHistoryRepository repository;

    public PartyNameHistoryService(PartyNameHistoryRepository repository) {
        this.repository = repository;
    }

    public List<PartyNameHistory> list() {
        return repository.findAll();
    }

    public PartyNameHistory get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyNameHistory %d not found".formatted(id)));
    }

    public PartyNameHistory create(PartyNameHistory entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyNameHistory update(Long id, PartyNameHistory entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyNameHistory %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}