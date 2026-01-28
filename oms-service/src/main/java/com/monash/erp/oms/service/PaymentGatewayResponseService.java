package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PaymentGatewayResponse;
import com.monash.erp.oms.repository.PaymentGatewayResponseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayResponseService {

    private final PaymentGatewayResponseRepository repository;

    public PaymentGatewayResponseService(PaymentGatewayResponseRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayResponse> list() {
        return repository.findAll();
    }

    public PaymentGatewayResponse get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayResponse %d not found".formatted(id)));
    }

    public PaymentGatewayResponse create(PaymentGatewayResponse entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayResponse update(Long id, PaymentGatewayResponse entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayResponse %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}