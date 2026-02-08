package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmplPositionResponsibility;
import com.monash.erp.oms.party.repository.EmplPositionResponsibilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionResponsibilityService {

    private final EmplPositionResponsibilityRepository repository;

    public EmplPositionResponsibilityService(EmplPositionResponsibilityRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionResponsibility> list() {
        return repository.findAll();
    }

    public EmplPositionResponsibility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionResponsibility %d not found".formatted(id)));
    }

    public EmplPositionResponsibility create(EmplPositionResponsibility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionResponsibility update(Long id, EmplPositionResponsibility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionResponsibility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}