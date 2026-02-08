package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.party.entity.CreditCard;
import com.monash.erp.oms.party.repository.CreditCardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CreditCardService {

    private final CreditCardRepository repository;

    public CreditCardService(CreditCardRepository repository) {
        this.repository = repository;
    }

    public List<CreditCard> list() {
        return repository.findAll();
    }

    public CreditCard get(String paymentMethodId) {
        return repository.findById(paymentMethodId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CreditCard %s not found".formatted(paymentMethodId)));
    }

    public CreditCard create(CreditCard entity) {
        return repository.save(entity);
    }

    public CreditCard update(String paymentMethodId, CreditCard entity) {
        if (!repository.existsById(paymentMethodId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CreditCard %s not found".formatted(paymentMethodId));
        }
        entity.setPaymentMethodId(paymentMethodId);
        return repository.save(entity);
    }

    public void delete(String paymentMethodId) {
        repository.deleteById(paymentMethodId);
    }
}
