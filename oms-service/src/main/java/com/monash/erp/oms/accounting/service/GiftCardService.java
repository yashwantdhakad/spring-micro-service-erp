package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GiftCard;
import com.monash.erp.oms.accounting.repository.GiftCardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GiftCardService {

    private final GiftCardRepository repository;

    public GiftCardService(GiftCardRepository repository) {
        this.repository = repository;
    }

    public List<GiftCard> list() {
        return repository.findAll();
    }

    public GiftCard get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GiftCard %d not found".formatted(id)));
    }

    public GiftCard create(GiftCard entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GiftCard update(Long id, GiftCard entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GiftCard %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
