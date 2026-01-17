package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.EftAccount;
import com.example.erp.oms.accounting.repository.EftAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EftAccountService {

    private final EftAccountRepository repository;

    public EftAccountService(EftAccountRepository repository) {
        this.repository = repository;
    }

    public List<EftAccount> list() {
        return repository.findAll();
    }

    public EftAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EftAccount %d not found".formatted(id)));
    }

    public EftAccount create(EftAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EftAccount update(Long id, EftAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EftAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
