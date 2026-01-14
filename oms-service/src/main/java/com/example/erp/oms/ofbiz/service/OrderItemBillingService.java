package com.example.erp.oms.ofbiz.service;

import com.example.erp.oms.ofbiz.domain.OrderItemBilling;
import com.example.erp.oms.ofbiz.repository.OrderItemBillingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemBillingService {

    private final OrderItemBillingRepository repository;

    public OrderItemBillingService(OrderItemBillingRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemBilling> list() {
        return repository.findAll();
    }

    public OrderItemBilling get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemBilling %d not found".formatted(id)));
    }

    public OrderItemBilling create(OrderItemBilling entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemBilling update(Long id, OrderItemBilling entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemBilling %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
