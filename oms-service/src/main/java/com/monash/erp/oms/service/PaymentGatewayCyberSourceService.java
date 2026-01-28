package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PaymentGatewayCyberSource;
import com.monash.erp.oms.repository.PaymentGatewayCyberSourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayCyberSourceService {

    private final PaymentGatewayCyberSourceRepository repository;

    public PaymentGatewayCyberSourceService(PaymentGatewayCyberSourceRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayCyberSource> list() {
        return repository.findAll();
    }

    public PaymentGatewayCyberSource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayCyberSource %d not found".formatted(id)));
    }

    public PaymentGatewayCyberSource create(PaymentGatewayCyberSource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayCyberSource update(Long id, PaymentGatewayCyberSource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayCyberSource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}