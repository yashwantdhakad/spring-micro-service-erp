package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.PaymentContentType;
import com.monash.erp.oms.accounting.repository.PaymentContentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentContentTypeService {

    private final PaymentContentTypeRepository repository;

    public PaymentContentTypeService(PaymentContentTypeRepository repository) {
        this.repository = repository;
    }

    public List<PaymentContentType> list() {
        return repository.findAll();
    }

    public PaymentContentType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentContentType %d not found".formatted(id)));
    }

    public PaymentContentType create(PaymentContentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentContentType update(Long id, PaymentContentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentContentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
