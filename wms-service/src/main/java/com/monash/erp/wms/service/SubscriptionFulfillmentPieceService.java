package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionFulfillmentPiece;
import com.monash.erp.wms.repository.SubscriptionFulfillmentPieceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionFulfillmentPieceService {

    private final SubscriptionFulfillmentPieceRepository repository;

    public SubscriptionFulfillmentPieceService(SubscriptionFulfillmentPieceRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionFulfillmentPiece> list() {
        return repository.findAll();
    }

    public SubscriptionFulfillmentPiece get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionFulfillmentPiece %d not found".formatted(id)));
    }

    public SubscriptionFulfillmentPiece create(SubscriptionFulfillmentPiece entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionFulfillmentPiece update(Long id, SubscriptionFulfillmentPiece entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionFulfillmentPiece %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}