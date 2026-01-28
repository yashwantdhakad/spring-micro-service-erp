package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderBlacklistType;
import com.monash.erp.oms.repository.OrderBlacklistTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderBlacklistTypeService {

    private final OrderBlacklistTypeRepository repository;

    public OrderBlacklistTypeService(OrderBlacklistTypeRepository repository) {
        this.repository = repository;
    }

    public List<OrderBlacklistType> list() {
        return repository.findAll();
    }

    public OrderBlacklistType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderBlacklistType %d not found".formatted(id)));
    }

    public OrderBlacklistType create(OrderBlacklistType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderBlacklistType update(Long id, OrderBlacklistType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderBlacklistType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}