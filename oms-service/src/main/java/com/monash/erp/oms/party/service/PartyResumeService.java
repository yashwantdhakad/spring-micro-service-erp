package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyResume;
import com.monash.erp.oms.party.repository.PartyResumeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyResumeService {

    private final PartyResumeRepository repository;

    public PartyResumeService(PartyResumeRepository repository) {
        this.repository = repository;
    }

    public List<PartyResume> list() {
        return repository.findAll();
    }

    public PartyResume get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyResume %d not found".formatted(id)));
    }

    public PartyResume create(PartyResume entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyResume update(Long id, PartyResume entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyResume %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}