package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmplPositionTypeClass;
import com.monash.erp.oms.party.repository.EmplPositionTypeClassRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionTypeClassService {

    private final EmplPositionTypeClassRepository repository;

    public EmplPositionTypeClassService(EmplPositionTypeClassRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionTypeClass> list() {
        return repository.findAll();
    }

    public EmplPositionTypeClass get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionTypeClass %d not found".formatted(id)));
    }

    public EmplPositionTypeClass create(EmplPositionTypeClass entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionTypeClass update(Long id, EmplPositionTypeClass entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionTypeClass %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}