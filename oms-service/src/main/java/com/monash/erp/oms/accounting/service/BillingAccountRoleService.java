package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.BillingAccountRole;
import com.monash.erp.oms.accounting.repository.BillingAccountRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BillingAccountRoleService {

    private final BillingAccountRoleRepository repository;

    public BillingAccountRoleService(BillingAccountRoleRepository repository) {
        this.repository = repository;
    } 

    public List<BillingAccountRole> list() {
        return repository.findAll();
    }

    public BillingAccountRole get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccountRole %d not found".formatted(id)));
    }

    public BillingAccountRole create(BillingAccountRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BillingAccountRole update(Long id, BillingAccountRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BillingAccountRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
