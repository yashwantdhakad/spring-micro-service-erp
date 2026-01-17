package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGatewayOrbital;
import com.example.erp.oms.accounting.repository.PaymentGatewayOrbitalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayOrbitalService {

    private final PaymentGatewayOrbitalRepository repository;

    public PaymentGatewayOrbitalService(PaymentGatewayOrbitalRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayOrbital> list() {
        return repository.findAll();
    }

    public PaymentGatewayOrbital get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayOrbital %d not found".formatted(id)));
    }

    public PaymentGatewayOrbital create(PaymentGatewayOrbital entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayOrbital update(Long id, PaymentGatewayOrbital entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayOrbital %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
