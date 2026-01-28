package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyRateNew;
import com.monash.erp.party.repository.PartyRateNewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyRateNewService {

    private final PartyRateNewRepository repository;

    public PartyRateNewService(PartyRateNewRepository repository) {
        this.repository = repository;
    }

    public List<PartyRateNew> list() {
        return repository.findAll();
    }

    public PartyRateNew get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRateNew %d not found".formatted(id)));
    }

    public PartyRateNew create(PartyRateNew entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyRateNew update(Long id, PartyRateNew entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRateNew %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}