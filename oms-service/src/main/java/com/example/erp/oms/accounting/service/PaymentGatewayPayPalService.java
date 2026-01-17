package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGatewayPayPal;
import com.example.erp.oms.accounting.repository.PaymentGatewayPayPalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayPayPalService {

    private final PaymentGatewayPayPalRepository repository;

    public PaymentGatewayPayPalService(PaymentGatewayPayPalRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayPayPal> list() {
        return repository.findAll();
    }

    public PaymentGatewayPayPal get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayPayPal %d not found".formatted(id)));
    }

    public PaymentGatewayPayPal create(PaymentGatewayPayPal entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayPayPal update(Long id, PaymentGatewayPayPal entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayPayPal %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
