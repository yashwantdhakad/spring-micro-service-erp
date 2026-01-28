package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderNotification;
import com.monash.erp.oms.repository.OrderNotificationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderNotificationService {

    private final OrderNotificationRepository repository;

    public OrderNotificationService(OrderNotificationRepository repository) {
        this.repository = repository;
    }

    public List<OrderNotification> list() {
        return repository.findAll();
    }

    public OrderNotification get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderNotification %d not found".formatted(id)));
    }

    public OrderNotification create(OrderNotification entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderNotification update(Long id, OrderNotification entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderNotification %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}