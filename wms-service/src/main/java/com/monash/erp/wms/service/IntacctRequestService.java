package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.IntacctRequest;
import com.monash.erp.wms.repository.IntacctRequestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IntacctRequestService {

    private final IntacctRequestRepository repository;

    public IntacctRequestService(IntacctRequestRepository repository) {
        this.repository = repository;
    }

    public List<IntacctRequest> list() {
        return repository.findAll();
    }

    public IntacctRequest get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "IntacctRequest %d not found".formatted(id)));
    }

    public IntacctRequest create(IntacctRequest entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public IntacctRequest update(Long id, IntacctRequest entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "IntacctRequest %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}