package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGroup;
import com.example.erp.oms.accounting.repository.PaymentGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGroupService {

    private final PaymentGroupRepository repository;

    public PaymentGroupService(PaymentGroupRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGroup> list() {
        return repository.findAll();
    }

    public PaymentGroup get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGroup %d not found".formatted(id)));
    }

    public PaymentGroup create(PaymentGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGroup update(Long id, PaymentGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
