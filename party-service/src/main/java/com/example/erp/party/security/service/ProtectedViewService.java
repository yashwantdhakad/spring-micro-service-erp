package com.example.erp.party.security.service;

import com.example.erp.party.security.domain.ProtectedView;
import com.example.erp.party.security.repository.ProtectedViewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProtectedViewService {

    private final ProtectedViewRepository repository;

    public ProtectedViewService(ProtectedViewRepository repository) {
        this.repository = repository;
    }

    public List<ProtectedView> list() {
        return repository.findAll();
    }

    public ProtectedView get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProtectedView %d not found".formatted(id)));
    }

    public ProtectedView create(ProtectedView entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProtectedView update(Long id, ProtectedView entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProtectedView %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
