package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGatewayConfigType;
import com.example.erp.oms.accounting.repository.PaymentGatewayConfigTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayConfigTypeService {

    private final PaymentGatewayConfigTypeRepository repository;

    public PaymentGatewayConfigTypeService(PaymentGatewayConfigTypeRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayConfigType> list() {
        return repository.findAll();
    }

    public PaymentGatewayConfigType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayConfigType %d not found".formatted(id)));
    }

    public PaymentGatewayConfigType create(PaymentGatewayConfigType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayConfigType update(Long id, PaymentGatewayConfigType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayConfigType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
