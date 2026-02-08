package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyIdentification;
import com.monash.erp.oms.party.repository.PartyIdentificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyIdentificationService {

    private final PartyIdentificationRepository repository;

    public PartyIdentificationService(PartyIdentificationRepository repository) {
        this.repository = repository;
    }

    public List<PartyIdentification> list() {
        return repository.findAll();
    }

    public PartyIdentification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyIdentification %d not found".formatted(id)));
    }

    public PartyIdentification create(PartyIdentification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyIdentification update(Long id, PartyIdentification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyIdentification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}