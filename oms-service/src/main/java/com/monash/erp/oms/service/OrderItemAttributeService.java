package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemAttribute;
import com.monash.erp.oms.repository.OrderItemAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemAttributeService {

    private final OrderItemAttributeRepository repository;

    public OrderItemAttributeService(OrderItemAttributeRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemAttribute> list() {
        return repository.findAll();
    }

    public OrderItemAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAttribute %d not found".formatted(id)));
    }

    public OrderItemAttribute create(OrderItemAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemAttribute update(Long id, OrderItemAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}