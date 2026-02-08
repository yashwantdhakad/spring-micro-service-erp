package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmplPositionFulfillment;
import com.monash.erp.oms.party.repository.EmplPositionFulfillmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionFulfillmentService {

    private final EmplPositionFulfillmentRepository repository;

    public EmplPositionFulfillmentService(EmplPositionFulfillmentRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionFulfillment> list() {
        return repository.findAll();
    }

    public EmplPositionFulfillment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionFulfillment %d not found".formatted(id)));
    }

    public EmplPositionFulfillment create(EmplPositionFulfillment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionFulfillment update(Long id, EmplPositionFulfillment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionFulfillment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}