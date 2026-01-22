package com.monash.erp.oms.order.service;

import com.monash.erp.oms.order.entity.OrderContent;
import com.monash.erp.oms.order.repository.OrderContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderContentService {

    private final OrderContentRepository repository;

    public OrderContentService(OrderContentRepository repository) {
        this.repository = repository;
    }

    public List<OrderContent> list() {
        return repository.findAll();
    }

    public OrderContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderContent %d not found".formatted(id)));
    }

    public OrderContent create(OrderContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderContent update(Long id, OrderContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
