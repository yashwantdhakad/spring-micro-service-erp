package com.monash.erp.party.service;

import com.monash.erp.party.entity.EmplPosition;
import com.monash.erp.party.repository.EmplPositionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionService {

    private final EmplPositionRepository repository;

    public EmplPositionService(EmplPositionRepository repository) {
        this.repository = repository;
    }

    public List<EmplPosition> list() {
        return repository.findAll();
    }

    public EmplPosition get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPosition %d not found".formatted(id)));
    }

    public EmplPosition create(EmplPosition entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPosition update(Long id, EmplPosition entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPosition %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}