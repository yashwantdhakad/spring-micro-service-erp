package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PaymentType;
import com.monash.erp.oms.repository.PaymentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentTypeService {

    private final PaymentTypeRepository repository;

    public PaymentTypeService(PaymentTypeRepository repository) {
        this.repository = repository;
    }

    public List<PaymentType> list() {
        return repository.findAll();
    }

    public PaymentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentType %d not found".formatted(id)));
    }

    public PaymentType create(PaymentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentType update(Long id, PaymentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}