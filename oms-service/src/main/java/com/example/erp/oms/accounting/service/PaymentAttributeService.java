package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentAttribute;
import com.example.erp.oms.accounting.repository.PaymentAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentAttributeService {

    private final PaymentAttributeRepository repository;

    public PaymentAttributeService(PaymentAttributeRepository repository) {
        this.repository = repository;
    }

    public List<PaymentAttribute> list() {
        return repository.findAll();
    }

    public PaymentAttribute get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentAttribute %d not found".formatted(id)));
    }

    public PaymentAttribute create(PaymentAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentAttribute update(Long id, PaymentAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
