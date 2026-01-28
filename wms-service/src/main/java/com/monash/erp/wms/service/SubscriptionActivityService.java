package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionActivity;
import com.monash.erp.wms.repository.SubscriptionActivityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionActivityService {

    private final SubscriptionActivityRepository repository;

    public SubscriptionActivityService(SubscriptionActivityRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionActivity> list() {
        return repository.findAll();
    }

    public SubscriptionActivity get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionActivity %d not found".formatted(id)));
    }

    public SubscriptionActivity create(SubscriptionActivity entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionActivity update(Long id, SubscriptionActivity entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionActivity %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}