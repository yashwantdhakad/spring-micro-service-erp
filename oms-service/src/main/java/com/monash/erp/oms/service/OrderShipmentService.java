package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderShipment;
import com.monash.erp.oms.repository.OrderShipmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderShipmentService {

    private final OrderShipmentRepository repository;

    public OrderShipmentService(OrderShipmentRepository repository) {
        this.repository = repository;
    }

    public List<OrderShipment> list() {
        return repository.findAll();
    }

    public OrderShipment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderShipment %d not found".formatted(id)));
    }

    public OrderShipment create(OrderShipment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderShipment update(Long id, OrderShipment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderShipment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}