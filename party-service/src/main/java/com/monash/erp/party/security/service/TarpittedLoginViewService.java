package com.monash.erp.party.security.service;

import com.monash.erp.party.security.entity.TarpittedLoginView;
import com.monash.erp.party.security.repository.TarpittedLoginViewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TarpittedLoginViewService {

    private final TarpittedLoginViewRepository repository;

    public TarpittedLoginViewService(TarpittedLoginViewRepository repository) {
        this.repository = repository;
    }

    public List<TarpittedLoginView> list() {
        return repository.findAll();
    }

    public TarpittedLoginView get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TarpittedLoginView %d not found".formatted(id)));
    }

    public TarpittedLoginView create(TarpittedLoginView entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TarpittedLoginView update(Long id, TarpittedLoginView entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TarpittedLoginView %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
