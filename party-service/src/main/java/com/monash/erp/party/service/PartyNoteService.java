package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyNote;
import com.monash.erp.party.repository.PartyNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyNoteService {

    private final PartyNoteRepository repository;

    public PartyNoteService(PartyNoteRepository repository) {
        this.repository = repository;
    }

    public List<PartyNote> list() {
        return repository.findAll();
    }

    public PartyNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyNote %d not found".formatted(id)));
    }

    public PartyNote create(PartyNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyNote update(Long id, PartyNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}