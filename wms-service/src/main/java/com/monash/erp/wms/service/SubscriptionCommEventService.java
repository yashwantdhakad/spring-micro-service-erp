package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionCommEvent;
import com.monash.erp.wms.repository.SubscriptionCommEventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionCommEventService {

    private final SubscriptionCommEventRepository repository;

    public SubscriptionCommEventService(SubscriptionCommEventRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionCommEvent> list() {
        return repository.findAll();
    }

    public SubscriptionCommEvent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionCommEvent %d not found".formatted(id)));
    }

    public SubscriptionCommEvent create(SubscriptionCommEvent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionCommEvent update(Long id, SubscriptionCommEvent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionCommEvent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}