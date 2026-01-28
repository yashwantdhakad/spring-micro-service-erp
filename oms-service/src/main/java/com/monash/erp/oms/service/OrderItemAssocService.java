package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemAssoc;
import com.monash.erp.oms.repository.OrderItemAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemAssocService {

    private final OrderItemAssocRepository repository;

    public OrderItemAssocService(OrderItemAssocRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemAssoc> list() {
        return repository.findAll();
    }

    public OrderItemAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAssoc %d not found".formatted(id)));
    }

    public OrderItemAssoc create(OrderItemAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemAssoc update(Long id, OrderItemAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}