package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderBlacklist;
import com.monash.erp.oms.repository.OrderBlacklistRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderBlacklistService {

    private final OrderBlacklistRepository repository;

    public OrderBlacklistService(OrderBlacklistRepository repository) {
        this.repository = repository;
    }

    public List<OrderBlacklist> list() {
        return repository.findAll();
    }

    public OrderBlacklist get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderBlacklist %d not found".formatted(id)));
    }

    public OrderBlacklist create(OrderBlacklist entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderBlacklist update(Long id, OrderBlacklist entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderBlacklist %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}