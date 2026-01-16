package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.PartyClassificationGroup;
import com.example.erp.party.ofbiz.repository.PartyClassificationGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyClassificationGroupService {

    private final PartyClassificationGroupRepository repository;

    public PartyClassificationGroupService(PartyClassificationGroupRepository repository) {
        this.repository = repository;
    }

    public List<PartyClassificationGroup> list() {
        return repository.findAll();
    }

    public PartyClassificationGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyClassificationGroup %d not found".formatted(id)));
    }

    public PartyClassificationGroup create(PartyClassificationGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyClassificationGroup update(Long id, PartyClassificationGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyClassificationGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}