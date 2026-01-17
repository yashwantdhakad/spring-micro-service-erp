package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGatewayEway;
import com.example.erp.oms.accounting.repository.PaymentGatewayEwayRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayEwayService {

    private final PaymentGatewayEwayRepository repository;

    public PaymentGatewayEwayService(PaymentGatewayEwayRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayEway> list() {
        return repository.findAll();
    }

    public PaymentGatewayEway get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayEway %d not found".formatted(id)));
    }

    public PaymentGatewayEway create(PaymentGatewayEway entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayEway update(Long id, PaymentGatewayEway entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayEway %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
