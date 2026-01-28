package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemShipGroup;
import com.monash.erp.oms.repository.OrderItemShipGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemShipGroupService {

    private final OrderItemShipGroupRepository repository;

    public OrderItemShipGroupService(OrderItemShipGroupRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemShipGroup> list() {
        return repository.findAll();
    }

    public OrderItemShipGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemShipGroup %d not found".formatted(id)));
    }

    public OrderItemShipGroup create(OrderItemShipGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemShipGroup update(Long id, OrderItemShipGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemShipGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}