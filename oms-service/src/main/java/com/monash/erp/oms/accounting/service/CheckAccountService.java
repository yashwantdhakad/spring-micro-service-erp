package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.CheckAccount;
import com.monash.erp.oms.accounting.repository.CheckAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CheckAccountService {

    private final CheckAccountRepository repository;

    public CheckAccountService(CheckAccountRepository repository) {
        this.repository = repository;
    }

    public List<CheckAccount> list() {
        return repository.findAll();
    }

    public CheckAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CheckAccount %d not found".formatted(id)));
    }

    public CheckAccount create(CheckAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CheckAccount update(Long id, CheckAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CheckAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
