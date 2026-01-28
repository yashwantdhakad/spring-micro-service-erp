package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PayPalPaymentMethod;
import com.monash.erp.oms.repository.PayPalPaymentMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PayPalPaymentMethodService {

    private final PayPalPaymentMethodRepository repository;

    public PayPalPaymentMethodService(PayPalPaymentMethodRepository repository) {
        this.repository = repository;
    }

    public List<PayPalPaymentMethod> list() {
        return repository.findAll();
    }

    public PayPalPaymentMethod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PayPalPaymentMethod %d not found".formatted(id)));
    }

    public PayPalPaymentMethod create(PayPalPaymentMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PayPalPaymentMethod update(Long id, PayPalPaymentMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PayPalPaymentMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}