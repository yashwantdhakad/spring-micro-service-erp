package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionResource;
import com.monash.erp.wms.repository.SubscriptionResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionResourceService {

    private final SubscriptionResourceRepository repository;

    public SubscriptionResourceService(SubscriptionResourceRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionResource> list() {
        return repository.findAll();
    }

    public SubscriptionResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionResource %d not found".formatted(id)));
    }

    public SubscriptionResource create(SubscriptionResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionResource update(Long id, SubscriptionResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}