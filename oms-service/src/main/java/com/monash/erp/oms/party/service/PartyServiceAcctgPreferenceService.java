package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyAcctgPreference;
import com.monash.erp.oms.party.repository.PartyServiceAcctgPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyServiceAcctgPreferenceService {

    private final PartyServiceAcctgPreferenceRepository repository;

    public PartyServiceAcctgPreferenceService(PartyServiceAcctgPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<PartyAcctgPreference> list() {
        return repository.findAll();
    }

    public PartyAcctgPreference get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "PartyAcctgPreference %d not found".formatted(id)));
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