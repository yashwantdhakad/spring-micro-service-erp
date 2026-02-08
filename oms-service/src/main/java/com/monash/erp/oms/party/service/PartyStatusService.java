package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyStatus;
import com.monash.erp.oms.party.repository.PartyStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyStatusService {

    private final PartyStatusRepository repository;

    public PartyStatusService(PartyStatusRepository repository) {
        this.repository = repository;
    }

    public List<PartyStatus> list() {
        return repository.findAll();
    }

    public PartyStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyStatus %d not found".formatted(id)));
    }

    public PartyStatus create(PartyStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyStatus update(Long id, PartyStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}