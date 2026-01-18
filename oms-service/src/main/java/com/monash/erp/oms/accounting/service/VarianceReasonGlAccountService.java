package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.VarianceReasonGlAccount;
import com.monash.erp.oms.accounting.repository.VarianceReasonGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VarianceReasonGlAccountService {

    private final VarianceReasonGlAccountRepository repository;

    public VarianceReasonGlAccountService(VarianceReasonGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<VarianceReasonGlAccount> list() {
        return repository.findAll();
    }

    public VarianceReasonGlAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VarianceReasonGlAccount %d not found".formatted(id)));
    }

    public VarianceReasonGlAccount create(VarianceReasonGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VarianceReasonGlAccount update(Long id, VarianceReasonGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VarianceReasonGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
