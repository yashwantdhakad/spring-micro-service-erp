package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FinAccountTrans;
import com.example.erp.oms.accounting.repository.FinAccountTransRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountTransService {

    private final FinAccountTransRepository repository;

    public FinAccountTransService(FinAccountTransRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountTrans> list() {
        return repository.findAll();
    }

    public FinAccountTrans get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTrans %d not found".formatted(id)));
    }

    public FinAccountTrans create(FinAccountTrans entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountTrans update(Long id, FinAccountTrans entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTrans %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
