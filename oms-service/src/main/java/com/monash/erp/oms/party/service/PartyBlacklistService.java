package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyBlacklist;
import com.monash.erp.oms.party.repository.PartyBlacklistRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyBlacklistService {

    private final PartyBlacklistRepository repository;

    public PartyBlacklistService(PartyBlacklistRepository repository) {
        this.repository = repository;
    }

    public List<PartyBlacklist> list() {
        return repository.findAll();
    }

    public PartyBlacklist get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyBlacklist %d not found".formatted(id)));
    }

    public PartyBlacklist create(PartyBlacklist entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyBlacklist update(Long id, PartyBlacklist entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyBlacklist %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}