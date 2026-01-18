package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyContent;
import com.monash.erp.party.repository.PartyContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyContentService {

    private final PartyContentRepository repository;

    public PartyContentService(PartyContentRepository repository) {
        this.repository = repository;
    }

    public List<PartyContent> list() {
        return repository.findAll();
    }

    public PartyContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContent %d not found".formatted(id)));
    }

    public PartyContent create(PartyContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyContent update(Long id, PartyContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}