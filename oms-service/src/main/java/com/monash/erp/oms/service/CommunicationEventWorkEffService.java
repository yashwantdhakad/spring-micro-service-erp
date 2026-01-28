package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventWorkEff;
import com.monash.erp.oms.repository.CommunicationEventWorkEffRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventWorkEffService {

    private final CommunicationEventWorkEffRepository repository;

    public CommunicationEventWorkEffService(CommunicationEventWorkEffRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventWorkEff> list() {
        return repository.findAll();
    }

    public CommunicationEventWorkEff get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventWorkEff %d not found".formatted(id)));
    }

    public CommunicationEventWorkEff create(CommunicationEventWorkEff entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventWorkEff update(Long id, CommunicationEventWorkEff entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventWorkEff %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}