package com.monash.erp.party.service;

import com.monash.erp.party.entity.EmplLeave;
import com.monash.erp.party.repository.EmplLeaveRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplLeaveService {

    private final EmplLeaveRepository repository;

    public EmplLeaveService(EmplLeaveRepository repository) {
        this.repository = repository;
    }

    public List<EmplLeave> list() {
        return repository.findAll();
    }

    public EmplLeave get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplLeave %d not found".formatted(id)));
    }

    public EmplLeave create(EmplLeave entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplLeave update(Long id, EmplLeave entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplLeave %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}