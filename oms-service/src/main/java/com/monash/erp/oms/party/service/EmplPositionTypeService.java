package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmplPositionType;
import com.monash.erp.oms.party.repository.EmplPositionTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionTypeService {

    private final EmplPositionTypeRepository repository;

    public EmplPositionTypeService(EmplPositionTypeRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionType> list() {
        return repository.findAll();
    }

    public EmplPositionType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionType %d not found".formatted(id)));
    }

    public EmplPositionType create(EmplPositionType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionType update(Long id, EmplPositionType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}