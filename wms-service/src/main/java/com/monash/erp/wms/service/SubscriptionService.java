package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Subscription;
import com.monash.erp.wms.repository.SubscriptionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionService {

    private final SubscriptionRepository repository;

    public SubscriptionService(SubscriptionRepository repository) {
        this.repository = repository;
    }

    public List<Subscription> list() {
        return repository.findAll();
    }

    public Subscription get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription %d not found".formatted(id)));
    }

    public Subscription create(Subscription entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Subscription update(Long id, Subscription entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Subscription %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}