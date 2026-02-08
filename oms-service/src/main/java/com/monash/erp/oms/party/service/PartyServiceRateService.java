package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyRate;
import com.monash.erp.oms.party.repository.PartyServiceRateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyServiceRateService {

    private final PartyServiceRateRepository repository;

    public PartyServiceRateService(PartyServiceRateRepository repository) {
        this.repository = repository;
    }

    public List<PartyRate> list() {
        return repository.findAll();
    }

    public PartyRate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "PartyRate %d not found".formatted(id)));
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