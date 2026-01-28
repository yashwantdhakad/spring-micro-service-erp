package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderAdjustmentAttribute;
import com.monash.erp.oms.repository.OrderAdjustmentAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderAdjustmentAttributeService {

    private final OrderAdjustmentAttributeRepository repository;

    public OrderAdjustmentAttributeService(OrderAdjustmentAttributeRepository repository) {
        this.repository = repository;
    }

    public List<OrderAdjustmentAttribute> list() {
        return repository.findAll();
    }

    public OrderAdjustmentAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentAttribute %d not found".formatted(id)));
    }

    public OrderAdjustmentAttribute create(OrderAdjustmentAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderAdjustmentAttribute update(Long id, OrderAdjustmentAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}