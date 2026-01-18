package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentGatewaySecurePay;
import com.monash.erp.oms.accounting.repository.PaymentGatewaySecurePayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewaySecurePayService {

    private final PaymentGatewaySecurePayRepository repository;

    public PaymentGatewaySecurePayService(PaymentGatewaySecurePayRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewaySecurePay> list() {
        return repository.findAll();
    }

    public PaymentGatewaySecurePay get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewaySecurePay %d not found".formatted(id)));
    }

    public PaymentGatewaySecurePay create(PaymentGatewaySecurePay entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewaySecurePay update(Long id, PaymentGatewaySecurePay entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewaySecurePay %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
