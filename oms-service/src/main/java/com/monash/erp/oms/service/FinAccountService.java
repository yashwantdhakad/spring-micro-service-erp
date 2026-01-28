package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.FinAccount;
import com.monash.erp.oms.repository.FinAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountService {

    private final FinAccountRepository repository;

    public FinAccountService(FinAccountRepository repository) {
        this.repository = repository;
    }

    public List<FinAccount> list() {
        return repository.findAll();
    }

    public FinAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccount %d not found".formatted(id)));
    }

    public FinAccount create(FinAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccount update(Long id, FinAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}