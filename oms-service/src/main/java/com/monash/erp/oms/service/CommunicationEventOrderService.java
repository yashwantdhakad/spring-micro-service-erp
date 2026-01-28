package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventOrder;
import com.monash.erp.oms.repository.CommunicationEventOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventOrderService {

    private final CommunicationEventOrderRepository repository;

    public CommunicationEventOrderService(CommunicationEventOrderRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventOrder> list() {
        return repository.findAll();
    }

    public CommunicationEventOrder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventOrder %d not found".formatted(id)));
    }

    public CommunicationEventOrder create(CommunicationEventOrder entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventOrder update(Long id, CommunicationEventOrder entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventOrder %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}