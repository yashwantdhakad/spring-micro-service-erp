package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGlAccountTypeMap;
import com.example.erp.oms.accounting.repository.PaymentGlAccountTypeMapRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGlAccountTypeMapService {

    private final PaymentGlAccountTypeMapRepository repository;

    public PaymentGlAccountTypeMapService(PaymentGlAccountTypeMapRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGlAccountTypeMap> list() {
        return repository.findAll();
    }

    public PaymentGlAccountTypeMap get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGlAccountTypeMap %d not found".formatted(id)));
    }

    public PaymentGlAccountTypeMap create(PaymentGlAccountTypeMap entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGlAccountTypeMap update(Long id, PaymentGlAccountTypeMap entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGlAccountTypeMap %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
