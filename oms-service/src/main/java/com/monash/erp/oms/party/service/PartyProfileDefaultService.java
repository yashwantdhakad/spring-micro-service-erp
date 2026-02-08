package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyProfileDefault;
import com.monash.erp.oms.party.repository.PartyProfileDefaultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyProfileDefaultService {

    private final PartyProfileDefaultRepository repository;

    public PartyProfileDefaultService(PartyProfileDefaultRepository repository) {
        this.repository = repository;
    }

    public List<PartyProfileDefault> list() {
        return repository.findAll();
    }

    public PartyProfileDefault get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyProfileDefault %d not found".formatted(id)));
    }

    public PartyProfileDefault create(PartyProfileDefault entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyProfileDefault update(Long id, PartyProfileDefault entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyProfileDefault %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}