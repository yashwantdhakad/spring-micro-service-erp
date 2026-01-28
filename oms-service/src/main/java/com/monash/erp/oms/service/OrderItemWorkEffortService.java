package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemWorkEffort;
import com.monash.erp.oms.repository.OrderItemWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemWorkEffortService {

    private final OrderItemWorkEffortRepository repository;

    public OrderItemWorkEffortService(OrderItemWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemWorkEffort> list() {
        return repository.findAll();
    }

    public OrderItemWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemWorkEffort %d not found".formatted(id)));
    }

    public OrderItemWorkEffort create(OrderItemWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemWorkEffort update(Long id, OrderItemWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}