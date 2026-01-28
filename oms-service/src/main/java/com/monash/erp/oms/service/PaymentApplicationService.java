package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PaymentApplication;
import com.monash.erp.oms.repository.PaymentApplicationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentApplicationService {

    private final PaymentApplicationRepository repository;

    public PaymentApplicationService(PaymentApplicationRepository repository) {
        this.repository = repository;
    }

    public List<PaymentApplication> list() {
        return repository.findAll();
    }

    public PaymentApplication get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentApplication %d not found".formatted(id)));
    }

    public PaymentApplication create(PaymentApplication entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentApplication update(Long id, PaymentApplication entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentApplication %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}