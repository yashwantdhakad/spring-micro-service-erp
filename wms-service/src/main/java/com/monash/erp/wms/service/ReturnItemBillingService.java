package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnItemBilling;
import com.monash.erp.wms.repository.ReturnItemBillingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnItemBillingService {

    private final ReturnItemBillingRepository repository;

    public ReturnItemBillingService(ReturnItemBillingRepository repository) {
        this.repository = repository;
    }

    public List<ReturnItemBilling> list() {
        return repository.findAll();
    }

    public ReturnItemBilling get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemBilling %d not found".formatted(id)));
    }

    public ReturnItemBilling create(ReturnItemBilling entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnItemBilling update(Long id, ReturnItemBilling entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemBilling %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}