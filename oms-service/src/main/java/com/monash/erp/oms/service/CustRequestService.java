package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequest;
import com.monash.erp.oms.repository.CustRequestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestService {

    private final CustRequestRepository repository;

    public CustRequestService(CustRequestRepository repository) {
        this.repository = repository;
    }

    public List<CustRequest> list() {
        return repository.findAll();
    }

    public CustRequest get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequest %d not found".formatted(id)));
    }

    public CustRequest create(CustRequest entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequest update(Long id, CustRequest entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequest %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}