package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CreditCard;
import com.monash.erp.wms.repository.CreditCardRepository;
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

    public CreditCard get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CreditCard %d not found".formatted(id)));
    }

    public CreditCard create(CreditCard entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CreditCard update(Long id, CreditCard entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CreditCard %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}