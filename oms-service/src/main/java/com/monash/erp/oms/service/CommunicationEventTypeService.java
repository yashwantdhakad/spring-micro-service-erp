package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventType;
import com.monash.erp.oms.repository.CommunicationEventTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventTypeService {

    private final CommunicationEventTypeRepository repository;

    public CommunicationEventTypeService(CommunicationEventTypeRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventType> list() {
        return repository.findAll();
    }

    public CommunicationEventType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventType %d not found".formatted(id)));
    }

    public CommunicationEventType create(CommunicationEventType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventType update(Long id, CommunicationEventType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}