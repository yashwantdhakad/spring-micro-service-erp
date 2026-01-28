package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyAcctgPreference;
import com.monash.erp.party.repository.PartyAcctgPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyAcctgPreferenceService {

    private final PartyAcctgPreferenceRepository repository;

    public PartyAcctgPreferenceService(PartyAcctgPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<PartyAcctgPreference> list() {
        return repository.findAll();
    }

    public PartyAcctgPreference get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyAcctgPreference %d not found".formatted(id)));
    }

    public PartyAcctgPreference create(PartyAcctgPreference entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyAcctgPreference update(Long id, PartyAcctgPreference entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyAcctgPreference %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}