package com.monash.erp.party.service;

import com.monash.erp.party.entity.TelecomNumber;
import com.monash.erp.party.repository.TelecomNumberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TelecomNumberService {

    private final TelecomNumberRepository repository;

    public TelecomNumberService(TelecomNumberRepository repository) {
        this.repository = repository;
    }

    public List<TelecomNumber> list() {
        return repository.findAll();
    }

    public TelecomNumber get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomNumber %d not found".formatted(id)));
    }

    public TelecomNumber create(TelecomNumber entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TelecomNumber update(Long id, TelecomNumber entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomNumber %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}