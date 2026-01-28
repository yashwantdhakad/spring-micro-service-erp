package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GlAccount;
import com.monash.erp.oms.repository.GlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountService {

    private final GlAccountRepository repository;

    public GlAccountService(GlAccountRepository repository) {
        this.repository = repository;
    }

    public List<GlAccount> list() {
        return repository.findAll();
    }

    public GlAccount get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccount %d not found".formatted(id)));
    }

    public GlAccount create(GlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccount update(Long id, GlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}