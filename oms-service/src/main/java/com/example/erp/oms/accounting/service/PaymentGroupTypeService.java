package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGroupType;
import com.example.erp.oms.accounting.repository.PaymentGroupTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGroupTypeService {

    private final PaymentGroupTypeRepository repository;

    public PaymentGroupTypeService(PaymentGroupTypeRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGroupType> list() {
        return repository.findAll();
    }

    public PaymentGroupType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGroupType %d not found".formatted(id)));
    }

    public PaymentGroupType create(PaymentGroupType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGroupType update(Long id, PaymentGroupType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGroupType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
