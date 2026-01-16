package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyAttribute;
import com.example.erp.party.ofbiz.repository.PartyAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyAttributeService {

    private final PartyAttributeRepository repository;

    public PartyAttributeService(PartyAttributeRepository repository) {
        this.repository = repository;
    }

    public List<PartyAttribute> list() {
        return repository.findAll();
    }

    public PartyAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyAttribute %d not found".formatted(id)));
    }

    public PartyAttribute create(PartyAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyAttribute update(Long id, PartyAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}