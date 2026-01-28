package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderHeaderWorkEffort;
import com.monash.erp.oms.repository.OrderHeaderWorkEffortRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderHeaderWorkEffortService {

    private final OrderHeaderWorkEffortRepository repository;

    public OrderHeaderWorkEffortService(OrderHeaderWorkEffortRepository repository) {
        this.repository = repository;
    }

    public List<OrderHeaderWorkEffort> list() {
        return repository.findAll();
    }

    public OrderHeaderWorkEffort get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeaderWorkEffort %d not found".formatted(id)));
    }

    public OrderHeaderWorkEffort create(OrderHeaderWorkEffort entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderHeaderWorkEffort update(Long id, OrderHeaderWorkEffort entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeaderWorkEffort %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}