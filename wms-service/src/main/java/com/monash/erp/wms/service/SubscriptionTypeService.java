package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionType;
import com.monash.erp.wms.repository.SubscriptionTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionTypeService {

    private final SubscriptionTypeRepository repository;

    public SubscriptionTypeService(SubscriptionTypeRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionType> list() {
        return repository.findAll();
    }

    public SubscriptionType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionType %d not found".formatted(id)));
    }

    public SubscriptionType create(SubscriptionType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionType update(Long id, SubscriptionType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}