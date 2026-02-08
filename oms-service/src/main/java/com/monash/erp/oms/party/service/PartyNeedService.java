package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyNeed;
import com.monash.erp.oms.party.repository.PartyNeedRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyNeedService {

    private final PartyNeedRepository repository;

    public PartyNeedService(PartyNeedRepository repository) {
        this.repository = repository;
    }

    public List<PartyNeed> list() {
        return repository.findAll();
    }

    public PartyNeed get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyNeed %d not found".formatted(id)));
    }

    public PartyNeed create(PartyNeed entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyNeed update(Long id, PartyNeed entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyNeed %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}