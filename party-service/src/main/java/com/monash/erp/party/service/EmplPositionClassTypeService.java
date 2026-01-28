package com.monash.erp.party.service;

import com.monash.erp.party.entity.EmplPositionClassType;
import com.monash.erp.party.repository.EmplPositionClassTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionClassTypeService {

    private final EmplPositionClassTypeRepository repository;

    public EmplPositionClassTypeService(EmplPositionClassTypeRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionClassType> list() {
        return repository.findAll();
    }

    public EmplPositionClassType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionClassType %d not found".formatted(id)));
    }

    public EmplPositionClassType create(EmplPositionClassType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionClassType update(Long id, EmplPositionClassType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionClassType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}