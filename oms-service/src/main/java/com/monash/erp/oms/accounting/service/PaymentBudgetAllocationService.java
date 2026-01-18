package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentBudgetAllocation;
import com.monash.erp.oms.accounting.repository.PaymentBudgetAllocationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentBudgetAllocationService {

    private final PaymentBudgetAllocationRepository repository;

    public PaymentBudgetAllocationService(PaymentBudgetAllocationRepository repository) {
        this.repository = repository;
    }

    public List<PaymentBudgetAllocation> list() {
        return repository.findAll();
    }

    public PaymentBudgetAllocation get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentBudgetAllocation %d not found".formatted(id)));
    }

    public PaymentBudgetAllocation create(PaymentBudgetAllocation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentBudgetAllocation update(Long id, PaymentBudgetAllocation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentBudgetAllocation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
