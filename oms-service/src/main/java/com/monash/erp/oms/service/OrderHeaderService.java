package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderHeader;
import com.monash.erp.oms.repository.OrderHeaderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderHeaderService {

    private final OrderHeaderRepository repository;

    public OrderHeaderService(OrderHeaderRepository repository) {
        this.repository = repository;
    }

    public List<OrderHeader> list() {
        return repository.findAll();
    }

    public OrderHeader get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeader %d not found".formatted(id)));
    }

    public OrderHeader create(OrderHeader entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderHeader update(Long id, OrderHeader entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderHeader %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}