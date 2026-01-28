package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderTermAttribute;
import com.monash.erp.oms.repository.OrderTermAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderTermAttributeService {

    private final OrderTermAttributeRepository repository;

    public OrderTermAttributeService(OrderTermAttributeRepository repository) {
        this.repository = repository;
    }

    public List<OrderTermAttribute> list() {
        return repository.findAll();
    }

    public OrderTermAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderTermAttribute %d not found".formatted(id)));
    }

    public OrderTermAttribute create(OrderTermAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderTermAttribute update(Long id, OrderTermAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderTermAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}