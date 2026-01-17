package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentMethodTypeGlAccount;
import com.example.erp.oms.accounting.repository.PaymentMethodTypeGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentMethodTypeGlAccountService {

    private final PaymentMethodTypeGlAccountRepository repository;

    public PaymentMethodTypeGlAccountService(PaymentMethodTypeGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<PaymentMethodTypeGlAccount> list() {
        return repository.findAll();
    }

    public PaymentMethodTypeGlAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentMethodTypeGlAccount %d not found".formatted(id)));
    }

    public PaymentMethodTypeGlAccount create(PaymentMethodTypeGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentMethodTypeGlAccount update(Long id, PaymentMethodTypeGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentMethodTypeGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
