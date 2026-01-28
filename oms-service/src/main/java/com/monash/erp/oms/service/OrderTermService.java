package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderTerm;
import com.monash.erp.oms.repository.OrderTermRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderTermService {

    private final OrderTermRepository repository;

    public OrderTermService(OrderTermRepository repository) {
        this.repository = repository;
    }

    public List<OrderTerm> list() {
        return repository.findAll();
    }

    public OrderTerm get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderTerm %d not found".formatted(id)));
    }

    public OrderTerm create(OrderTerm entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderTerm update(Long id, OrderTerm entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderTerm %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}