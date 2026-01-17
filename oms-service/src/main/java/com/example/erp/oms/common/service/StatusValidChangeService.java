package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.StatusValidChange;
import com.example.erp.oms.common.repository.StatusValidChangeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StatusValidChangeService {

    private final StatusValidChangeRepository repository;

    public StatusValidChangeService(StatusValidChangeRepository repository) {
        this.repository = repository;
    }

    public List<StatusValidChange> list() {
        return repository.findAll();
    }

    public StatusValidChange get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "StatusValidChange %d not found".formatted(id)));
    }

    public StatusValidChange create(StatusValidChange entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public StatusValidChange update(Long id, StatusValidChange entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "StatusValidChange %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
