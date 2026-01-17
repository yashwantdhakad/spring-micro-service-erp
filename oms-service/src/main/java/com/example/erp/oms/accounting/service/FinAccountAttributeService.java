package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FinAccountAttribute;
import com.example.erp.oms.accounting.repository.FinAccountAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountAttributeService {

    private final FinAccountAttributeRepository repository;

    public FinAccountAttributeService(FinAccountAttributeRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountAttribute> list() {
        return repository.findAll();
    }

    public FinAccountAttribute get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountAttribute %d not found".formatted(id)));
    }

    public FinAccountAttribute create(FinAccountAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountAttribute update(Long id, FinAccountAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
