package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemQAOverride;
import com.monash.erp.oms.repository.OrderItemQAOverrideRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemQAOverrideService {

    private final OrderItemQAOverrideRepository repository;

    public OrderItemQAOverrideService(OrderItemQAOverrideRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemQAOverride> list() {
        return repository.findAll();
    }

    public OrderItemQAOverride get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemQAOverride %d not found".formatted(id)));
    }

    public OrderItemQAOverride create(OrderItemQAOverride entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemQAOverride update(Long id, OrderItemQAOverride entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemQAOverride %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}