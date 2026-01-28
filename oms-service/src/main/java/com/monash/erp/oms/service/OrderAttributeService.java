package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderAttribute;
import com.monash.erp.oms.repository.OrderAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderAttributeService {

    private final OrderAttributeRepository repository;

    public OrderAttributeService(OrderAttributeRepository repository) {
        this.repository = repository;
    }

    public List<OrderAttribute> list() {
        return repository.findAll();
    }

    public OrderAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAttribute %d not found".formatted(id)));
    }

    public OrderAttribute create(OrderAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderAttribute update(Long id, OrderAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}