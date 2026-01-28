package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyRate;
import com.monash.erp.party.repository.PartyRateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyRateService {

    private final PartyRateRepository repository;

    public PartyRateService(PartyRateRepository repository) {
        this.repository = repository;
    }

    public List<PartyRate> list() {
        return repository.findAll();
    }

    public PartyRate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRate %d not found".formatted(id)));
    }

    public PartyRate create(PartyRate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyRate update(Long id, PartyRate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}