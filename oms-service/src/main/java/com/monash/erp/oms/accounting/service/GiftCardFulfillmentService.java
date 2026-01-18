package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GiftCardFulfillment;
import com.monash.erp.oms.accounting.repository.GiftCardFulfillmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GiftCardFulfillmentService {

    private final GiftCardFulfillmentRepository repository;

    public GiftCardFulfillmentService(GiftCardFulfillmentRepository repository) {
        this.repository = repository;
    }

    public List<GiftCardFulfillment> list() {
        return repository.findAll();
    }

    public GiftCardFulfillment get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GiftCardFulfillment %d not found".formatted(id)));
    }

    public GiftCardFulfillment create(GiftCardFulfillment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GiftCardFulfillment update(Long id, GiftCardFulfillment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GiftCardFulfillment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
