package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.QuoteRole;
import com.monash.erp.oms.repository.QuoteRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class QuoteRoleService {

    private final QuoteRoleRepository repository;

    public QuoteRoleService(QuoteRoleRepository repository) {
        this.repository = repository;
    }

    public List<QuoteRole> list() {
        return repository.findAll();
    }

    public QuoteRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteRole %d not found".formatted(id)));
    }

    public QuoteRole create(QuoteRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public QuoteRole update(Long id, QuoteRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "QuoteRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}