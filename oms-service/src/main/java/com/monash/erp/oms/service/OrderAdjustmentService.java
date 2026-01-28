package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderAdjustment;
import com.monash.erp.oms.repository.OrderAdjustmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderAdjustmentService {

    private final OrderAdjustmentRepository repository;

    public OrderAdjustmentService(OrderAdjustmentRepository repository) {
        this.repository = repository;
    }

    public List<OrderAdjustment> list() {
        return repository.findAll();
    }

    public OrderAdjustment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustment %d not found".formatted(id)));
    }

    public OrderAdjustment create(OrderAdjustment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderAdjustment update(Long id, OrderAdjustment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}