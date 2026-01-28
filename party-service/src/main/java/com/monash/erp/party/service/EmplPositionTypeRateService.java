package com.monash.erp.party.service;

import com.monash.erp.party.entity.EmplPositionTypeRate;
import com.monash.erp.party.repository.EmplPositionTypeRateRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionTypeRateService {

    private final EmplPositionTypeRateRepository repository;

    public EmplPositionTypeRateService(EmplPositionTypeRateRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionTypeRate> list() {
        return repository.findAll();
    }

    public EmplPositionTypeRate get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionTypeRate %d not found".formatted(id)));
    }

    public EmplPositionTypeRate create(EmplPositionTypeRate entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionTypeRate update(Long id, EmplPositionTypeRate entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionTypeRate %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}