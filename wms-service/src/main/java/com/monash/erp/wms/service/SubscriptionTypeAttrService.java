package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SubscriptionTypeAttr;
import com.monash.erp.wms.repository.SubscriptionTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubscriptionTypeAttrService {

    private final SubscriptionTypeAttrRepository repository;

    public SubscriptionTypeAttrService(SubscriptionTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<SubscriptionTypeAttr> list() {
        return repository.findAll();
    }

    public SubscriptionTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionTypeAttr %d not found".formatted(id)));
    }

    public SubscriptionTypeAttr create(SubscriptionTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SubscriptionTypeAttr update(Long id, SubscriptionTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SubscriptionTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}