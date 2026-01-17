package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGatewayWorldPay;
import com.example.erp.oms.accounting.repository.PaymentGatewayWorldPayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayWorldPayService {

    private final PaymentGatewayWorldPayRepository repository;

    public PaymentGatewayWorldPayService(PaymentGatewayWorldPayRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayWorldPay> list() {
        return repository.findAll();
    }

    public PaymentGatewayWorldPay get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayWorldPay %d not found".formatted(id)));
    }

    public PaymentGatewayWorldPay create(PaymentGatewayWorldPay entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayWorldPay update(Long id, PaymentGatewayWorldPay entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayWorldPay %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
