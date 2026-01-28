package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PaymentMethod;
import com.monash.erp.oms.repository.PaymentMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentMethodService {

    private final PaymentMethodRepository repository;

    public PaymentMethodService(PaymentMethodRepository repository) {
        this.repository = repository;
    }

    public List<PaymentMethod> list() {
        return repository.findAll();
    }

    public PaymentMethod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentMethod %d not found".formatted(id)));
    }

    public PaymentMethod create(PaymentMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentMethod update(Long id, PaymentMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}