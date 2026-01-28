package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemChange;
import com.monash.erp.oms.repository.OrderItemChangeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemChangeService {

    private final OrderItemChangeRepository repository;

    public OrderItemChangeService(OrderItemChangeRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemChange> list() {
        return repository.findAll();
    }

    public OrderItemChange get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemChange %d not found".formatted(id)));
    }

    public OrderItemChange create(OrderItemChange entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemChange update(Long id, OrderItemChange entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemChange %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}