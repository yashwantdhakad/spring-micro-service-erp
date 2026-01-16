package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyGroup;
import com.example.erp.party.ofbiz.repository.PartyGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyGroupService {

    private final PartyGroupRepository repository;

    public PartyGroupService(PartyGroupRepository repository) {
        this.repository = repository;
    }

    public List<PartyGroup> list() {
        return repository.findAll();
    }

    public PartyGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGroup %d not found".formatted(id)));
    }

    public PartyGroup create(PartyGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyGroup update(Long id, PartyGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}