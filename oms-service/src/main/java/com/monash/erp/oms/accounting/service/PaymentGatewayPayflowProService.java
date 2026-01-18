package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentGatewayPayflowPro;
import com.monash.erp.oms.accounting.repository.PaymentGatewayPayflowProRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayPayflowProService {

    private final PaymentGatewayPayflowProRepository repository;

    public PaymentGatewayPayflowProService(PaymentGatewayPayflowProRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayPayflowPro> list() {
        return repository.findAll();
    }

    public PaymentGatewayPayflowPro get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayPayflowPro %d not found".formatted(id)));
    }

    public PaymentGatewayPayflowPro create(PaymentGatewayPayflowPro entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayPayflowPro update(Long id, PaymentGatewayPayflowPro entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayPayflowPro %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
