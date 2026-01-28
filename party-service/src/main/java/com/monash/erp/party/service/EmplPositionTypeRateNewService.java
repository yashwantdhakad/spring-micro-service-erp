package com.monash.erp.party.service;

import com.monash.erp.party.entity.EmplPositionTypeRateNew;
import com.monash.erp.party.repository.EmplPositionTypeRateNewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionTypeRateNewService {

    private final EmplPositionTypeRateNewRepository repository;

    public EmplPositionTypeRateNewService(EmplPositionTypeRateNewRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionTypeRateNew> list() {
        return repository.findAll();
    }

    public EmplPositionTypeRateNew get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionTypeRateNew %d not found".formatted(id)));
    }

    public EmplPositionTypeRateNew create(EmplPositionTypeRateNew entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionTypeRateNew update(Long id, EmplPositionTypeRateNew entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionTypeRateNew %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}