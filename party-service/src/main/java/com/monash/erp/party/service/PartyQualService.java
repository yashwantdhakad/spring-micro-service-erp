package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyQual;
import com.monash.erp.party.repository.PartyQualRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyQualService {

    private final PartyQualRepository repository;

    public PartyQualService(PartyQualRepository repository) {
        this.repository = repository;
    }

    public List<PartyQual> list() {
        return repository.findAll();
    }

    public PartyQual get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyQual %d not found".formatted(id)));
    }

    public PartyQual create(PartyQual entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyQual update(Long id, PartyQual entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyQual %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}