package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemAssocType;
import com.monash.erp.oms.repository.OrderItemAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemAssocTypeService {

    private final OrderItemAssocTypeRepository repository;

    public OrderItemAssocTypeService(OrderItemAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemAssocType> list() {
        return repository.findAll();
    }

    public OrderItemAssocType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAssocType %d not found".formatted(id)));
    }

    public OrderItemAssocType create(OrderItemAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemAssocType update(Long id, OrderItemAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}