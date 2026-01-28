package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.FinAccountStatus;
import com.monash.erp.oms.repository.FinAccountStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountStatusService {

    private final FinAccountStatusRepository repository;

    public FinAccountStatusService(FinAccountStatusRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountStatus> list() {
        return repository.findAll();
    }

    public FinAccountStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountStatus %d not found".formatted(id)));
    }

    public FinAccountStatus create(FinAccountStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountStatus update(Long id, FinAccountStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}