package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEvent;
import com.monash.erp.oms.repository.CommunicationEventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventService {

    private final CommunicationEventRepository repository;

    public CommunicationEventService(CommunicationEventRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEvent> list() {
        return repository.findAll();
    }

    public CommunicationEvent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEvent %d not found".formatted(id)));
    }

    public CommunicationEvent create(CommunicationEvent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEvent update(Long id, CommunicationEvent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEvent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}