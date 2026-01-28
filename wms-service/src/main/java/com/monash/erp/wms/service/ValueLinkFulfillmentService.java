package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ValueLinkFulfillment;
import com.monash.erp.wms.repository.ValueLinkFulfillmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ValueLinkFulfillmentService {

    private final ValueLinkFulfillmentRepository repository;

    public ValueLinkFulfillmentService(ValueLinkFulfillmentRepository repository) {
        this.repository = repository;
    }

    public List<ValueLinkFulfillment> list() {
        return repository.findAll();
    }

    public ValueLinkFulfillment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ValueLinkFulfillment %d not found".formatted(id)));
    }

    public ValueLinkFulfillment create(ValueLinkFulfillment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ValueLinkFulfillment update(Long id, ValueLinkFulfillment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ValueLinkFulfillment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}