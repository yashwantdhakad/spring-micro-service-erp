package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentGatewayConfig;
import com.monash.erp.oms.accounting.repository.PaymentGatewayConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayConfigService {

    private final PaymentGatewayConfigRepository repository;

    public PaymentGatewayConfigService(PaymentGatewayConfigRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayConfig> list() {
        return repository.findAll();
    }

    public PaymentGatewayConfig get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayConfig %d not found".formatted(id)));
    }

    public PaymentGatewayConfig create(PaymentGatewayConfig entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayConfig update(Long id, PaymentGatewayConfig entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayConfig %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
