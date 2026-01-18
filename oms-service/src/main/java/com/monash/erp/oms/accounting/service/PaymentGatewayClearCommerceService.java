package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentGatewayClearCommerce;
import com.monash.erp.oms.accounting.repository.PaymentGatewayClearCommerceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayClearCommerceService {

    private final PaymentGatewayClearCommerceRepository repository;

    public PaymentGatewayClearCommerceService(PaymentGatewayClearCommerceRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayClearCommerce> list() {
        return repository.findAll();
    }

    public PaymentGatewayClearCommerce get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayClearCommerce %d not found".formatted(id)));
    }

    public PaymentGatewayClearCommerce create(PaymentGatewayClearCommerce entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayClearCommerce update(Long id, PaymentGatewayClearCommerce entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayClearCommerce %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
