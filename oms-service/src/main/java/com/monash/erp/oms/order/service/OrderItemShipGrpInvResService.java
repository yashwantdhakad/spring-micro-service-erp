package com.monash.erp.oms.order.service;

import com.monash.erp.oms.order.entity.OrderItemShipGrpInvRes;
import com.monash.erp.oms.order.repository.OrderItemShipGrpInvResRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemShipGrpInvResService {

    private final OrderItemShipGrpInvResRepository repository;

    public OrderItemShipGrpInvResService(OrderItemShipGrpInvResRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemShipGrpInvRes> list() {
        return repository.findAll();
    }

    public OrderItemShipGrpInvRes get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemShipGrpInvRes %d not found".formatted(id)));
    }

    public OrderItemShipGrpInvRes create(OrderItemShipGrpInvRes entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemShipGrpInvRes update(Long id, OrderItemShipGrpInvRes entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemShipGrpInvRes %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
