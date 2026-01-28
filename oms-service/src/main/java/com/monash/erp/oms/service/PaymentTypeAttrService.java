package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.PaymentTypeAttr;
import com.monash.erp.oms.repository.PaymentTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentTypeAttrService {

    private final PaymentTypeAttrRepository repository;

    public PaymentTypeAttrService(PaymentTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<PaymentTypeAttr> list() {
        return repository.findAll();
    }

    public PaymentTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentTypeAttr %d not found".formatted(id)));
    }

    public PaymentTypeAttr create(PaymentTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentTypeAttr update(Long id, PaymentTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}