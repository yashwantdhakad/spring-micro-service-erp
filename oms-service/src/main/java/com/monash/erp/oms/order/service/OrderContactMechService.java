package com.monash.erp.oms.order.service;

import com.monash.erp.oms.order.entity.OrderContactMech;
import com.monash.erp.oms.order.repository.OrderContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderContactMechService {

    private final OrderContactMechRepository repository;

    public OrderContactMechService(OrderContactMechRepository repository) {
        this.repository = repository;
    }

    public List<OrderContactMech> list() {
        return repository.findAll();
    }

    public OrderContactMech get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderContactMech %d not found".formatted(id)));
    }

    public OrderContactMech create(OrderContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderContactMech update(Long id, OrderContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
