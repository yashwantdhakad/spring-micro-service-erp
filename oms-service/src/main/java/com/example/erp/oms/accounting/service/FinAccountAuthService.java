package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FinAccountAuth;
import com.example.erp.oms.accounting.repository.FinAccountAuthRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountAuthService {

    private final FinAccountAuthRepository repository;

    public FinAccountAuthService(FinAccountAuthRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountAuth> list() {
        return repository.findAll();
    }

    public FinAccountAuth get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountAuth %d not found".formatted(id)));
    }

    public FinAccountAuth create(FinAccountAuth entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountAuth update(Long id, FinAccountAuth entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountAuth %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
