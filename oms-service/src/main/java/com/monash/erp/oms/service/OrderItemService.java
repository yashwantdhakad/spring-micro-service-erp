package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItem;
import com.monash.erp.oms.repository.OrderItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemService {

    private final OrderItemRepository repository;

    public OrderItemService(OrderItemRepository repository) {
        this.repository = repository;
    }

    public List<OrderItem> list() {
        return repository.findAll();
    }

    public OrderItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItem %d not found".formatted(id)));
    }

    public OrderItem create(OrderItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItem update(Long id, OrderItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}