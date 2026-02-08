package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyCAGCode;
import com.monash.erp.oms.party.repository.PartyCAGCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyCAGCodeService {

    private final PartyCAGCodeRepository repository;

    public PartyCAGCodeService(PartyCAGCodeRepository repository) {
        this.repository = repository;
    }

    public List<PartyCAGCode> list() {
        return repository.findAll();
    }

    public PartyCAGCode get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyCAGCode %d not found".formatted(id)));
    }

    public PartyCAGCode create(PartyCAGCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyCAGCode update(Long id, PartyCAGCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyCAGCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}