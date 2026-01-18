package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentGatewaySagePay;
import com.monash.erp.oms.accounting.repository.PaymentGatewaySagePayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewaySagePayService {

    private final PaymentGatewaySagePayRepository repository;

    public PaymentGatewaySagePayService(PaymentGatewaySagePayRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewaySagePay> list() {
        return repository.findAll();
    }

    public PaymentGatewaySagePay get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewaySagePay %d not found".formatted(id)));
    }

    public PaymentGatewaySagePay create(PaymentGatewaySagePay entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewaySagePay update(Long id, PaymentGatewaySagePay entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewaySagePay %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
