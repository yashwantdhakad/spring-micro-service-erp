package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentContent;
import com.example.erp.oms.accounting.repository.PaymentContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentContentService {

    private final PaymentContentRepository repository;

    public PaymentContentService(PaymentContentRepository repository) {
        this.repository = repository;
    }

    public List<PaymentContent> list() {
        return repository.findAll();
    }

    public PaymentContent get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentContent %d not found".formatted(id)));
    }

    public PaymentContent create(PaymentContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentContent update(Long id, PaymentContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
