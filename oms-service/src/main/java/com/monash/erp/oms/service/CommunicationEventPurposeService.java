package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventPurpose;
import com.monash.erp.oms.repository.CommunicationEventPurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventPurposeService {

    private final CommunicationEventPurposeRepository repository;

    public CommunicationEventPurposeService(CommunicationEventPurposeRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventPurpose> list() {
        return repository.findAll();
    }

    public CommunicationEventPurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventPurpose %d not found".formatted(id)));
    }

    public CommunicationEventPurpose create(CommunicationEventPurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventPurpose update(Long id, CommunicationEventPurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventPurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}