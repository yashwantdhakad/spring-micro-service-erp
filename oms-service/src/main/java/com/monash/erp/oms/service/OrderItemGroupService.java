package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemGroup;
import com.monash.erp.oms.repository.OrderItemGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemGroupService {

    private final OrderItemGroupRepository repository;

    public OrderItemGroupService(OrderItemGroupRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemGroup> list() {
        return repository.findAll();
    }

    public OrderItemGroup get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemGroup %d not found".formatted(id)));
    }

    public OrderItemGroup create(OrderItemGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemGroup update(Long id, OrderItemGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}