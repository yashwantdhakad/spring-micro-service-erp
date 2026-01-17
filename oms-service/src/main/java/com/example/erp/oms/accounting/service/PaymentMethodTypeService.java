package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentMethodType;
import com.example.erp.oms.accounting.repository.PaymentMethodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentMethodTypeService {

    private final PaymentMethodTypeRepository repository;

    public PaymentMethodTypeService(PaymentMethodTypeRepository repository) {
        this.repository = repository;
    }

    public List<PaymentMethodType> list() {
        return repository.findAll();
    }

    public PaymentMethodType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentMethodType %d not found".formatted(id)));
    }

    public PaymentMethodType create(PaymentMethodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentMethodType update(Long id, PaymentMethodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentMethodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
