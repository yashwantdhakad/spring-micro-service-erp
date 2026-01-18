package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentGatewayAuthorizeNet;
import com.monash.erp.oms.accounting.repository.PaymentGatewayAuthorizeNetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayAuthorizeNetService {

    private final PaymentGatewayAuthorizeNetRepository repository;

    public PaymentGatewayAuthorizeNetService(PaymentGatewayAuthorizeNetRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayAuthorizeNet> list() {
        return repository.findAll();
    }

    public PaymentGatewayAuthorizeNet get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayAuthorizeNet %d not found".formatted(id)));
    }

    public PaymentGatewayAuthorizeNet create(PaymentGatewayAuthorizeNet entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayAuthorizeNet update(Long id, PaymentGatewayAuthorizeNet entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayAuthorizeNet %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
