package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventProduct;
import com.monash.erp.oms.repository.CommunicationEventProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventProductService {

    private final CommunicationEventProductRepository repository;

    public CommunicationEventProductService(CommunicationEventProductRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventProduct> list() {
        return repository.findAll();
    }

    public CommunicationEventProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventProduct %d not found".formatted(id)));
    }

    public CommunicationEventProduct create(CommunicationEventProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventProduct update(Long id, CommunicationEventProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}