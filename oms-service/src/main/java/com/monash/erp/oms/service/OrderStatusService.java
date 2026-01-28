package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderStatus;
import com.monash.erp.oms.repository.OrderStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderStatusService {

    private final OrderStatusRepository repository;

    public OrderStatusService(OrderStatusRepository repository) {
        this.repository = repository;
    }

    public List<OrderStatus> list() {
        return repository.findAll();
    }

    public OrderStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderStatus %d not found".formatted(id)));
    }

    public OrderStatus create(OrderStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderStatus update(Long id, OrderStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}