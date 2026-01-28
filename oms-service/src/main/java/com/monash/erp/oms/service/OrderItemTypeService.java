package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemType;
import com.monash.erp.oms.repository.OrderItemTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemTypeService {

    private final OrderItemTypeRepository repository;

    public OrderItemTypeService(OrderItemTypeRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemType> list() {
        return repository.findAll();
    }

    public OrderItemType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemType %d not found".formatted(id)));
    }

    public OrderItemType create(OrderItemType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemType update(Long id, OrderItemType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}