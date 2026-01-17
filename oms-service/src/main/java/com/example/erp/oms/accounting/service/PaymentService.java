package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.Payment;
import com.example.erp.oms.accounting.repository.PaymentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public List<Payment> list() {
        return repository.findAll();
    }

    public Payment get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Payment %d not found".formatted(id)));
    }

    public Payment create(Payment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Payment update(Long id, Payment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Payment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
