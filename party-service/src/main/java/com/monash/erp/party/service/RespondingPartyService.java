package com.monash.erp.party.service;

import com.monash.erp.party.entity.RespondingParty;
import com.monash.erp.party.repository.RespondingPartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RespondingPartyService {

    private final RespondingPartyRepository repository;

    public RespondingPartyService(RespondingPartyRepository repository) {
        this.repository = repository;
    }

    public List<RespondingParty> list() {
        return repository.findAll();
    }

    public RespondingParty get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RespondingParty %d not found".formatted(id)));
    }

    public RespondingParty create(RespondingParty entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RespondingParty update(Long id, RespondingParty entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RespondingParty %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}