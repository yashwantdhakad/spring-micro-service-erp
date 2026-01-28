package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemShipGroupAssoc;
import com.monash.erp.oms.repository.OrderItemShipGroupAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemShipGroupAssocService {

    private final OrderItemShipGroupAssocRepository repository;

    public OrderItemShipGroupAssocService(OrderItemShipGroupAssocRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemShipGroupAssoc> list() {
        return repository.findAll();
    }

    public OrderItemShipGroupAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemShipGroupAssoc %d not found".formatted(id)));
    }

    public OrderItemShipGroupAssoc create(OrderItemShipGroupAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemShipGroupAssoc update(Long id, OrderItemShipGroupAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemShipGroupAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}