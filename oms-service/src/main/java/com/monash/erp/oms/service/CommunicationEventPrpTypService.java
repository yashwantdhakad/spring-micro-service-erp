package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventPrpTyp;
import com.monash.erp.oms.repository.CommunicationEventPrpTypRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventPrpTypService {

    private final CommunicationEventPrpTypRepository repository;

    public CommunicationEventPrpTypService(CommunicationEventPrpTypRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventPrpTyp> list() {
        return repository.findAll();
    }

    public CommunicationEventPrpTyp get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventPrpTyp %d not found".formatted(id)));
    }

    public CommunicationEventPrpTyp create(CommunicationEventPrpTyp entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventPrpTyp update(Long id, CommunicationEventPrpTyp entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventPrpTyp %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}