package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderAdjustmentBilling;
import com.monash.erp.oms.repository.OrderAdjustmentBillingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderAdjustmentBillingService {

    private final OrderAdjustmentBillingRepository repository;

    public OrderAdjustmentBillingService(OrderAdjustmentBillingRepository repository) {
        this.repository = repository;
    }

    public List<OrderAdjustmentBilling> list() {
        return repository.findAll();
    }

    public OrderAdjustmentBilling get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentBilling %d not found".formatted(id)));
    }

    public OrderAdjustmentBilling create(OrderAdjustmentBilling entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderAdjustmentBilling update(Long id, OrderAdjustmentBilling entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentBilling %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}