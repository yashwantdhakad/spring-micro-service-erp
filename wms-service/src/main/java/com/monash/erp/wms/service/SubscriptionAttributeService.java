package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionAttribute;
import com.monash.erp.wms.repository.SubscriptionAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionAttributeService {

    private final SubscriptionAttributeRepository repository;

    public SubscriptionAttributeService(SubscriptionAttributeRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionAttribute> list() {
        return repository.findAll();
    }

    public SubscriptionAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionAttribute %d not found".formatted(id)));
    }

    public SubscriptionAttribute create(SubscriptionAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionAttribute update(Long id, SubscriptionAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}