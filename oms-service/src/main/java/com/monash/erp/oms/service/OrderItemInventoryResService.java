package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemInventoryRes;
import com.monash.erp.oms.repository.OrderItemInventoryResRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemInventoryResService {

    private final OrderItemInventoryResRepository repository;

    public OrderItemInventoryResService(OrderItemInventoryResRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemInventoryRes> list() {
        return repository.findAll();
    }

    public OrderItemInventoryRes get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemInventoryRes %d not found".formatted(id)));
    }

    public OrderItemInventoryRes create(OrderItemInventoryRes entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemInventoryRes update(Long id, OrderItemInventoryRes entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemInventoryRes %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}