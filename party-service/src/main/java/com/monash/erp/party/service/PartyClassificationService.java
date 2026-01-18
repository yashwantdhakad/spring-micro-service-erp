package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyClassification;
import com.monash.erp.party.repository.PartyClassificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyClassificationService {

    private final PartyClassificationRepository repository;

    public PartyClassificationService(PartyClassificationRepository repository) {
        this.repository = repository;
    }

    public List<PartyClassification> list() {
        return repository.findAll();
    }

    public PartyClassification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyClassification %d not found".formatted(id)));
    }

    public PartyClassification create(PartyClassification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyClassification update(Long id, PartyClassification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyClassification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}