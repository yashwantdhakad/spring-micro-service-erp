package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderAdjustmentType;
import com.monash.erp.oms.repository.OrderAdjustmentTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderAdjustmentTypeService {

    private final OrderAdjustmentTypeRepository repository;

    public OrderAdjustmentTypeService(OrderAdjustmentTypeRepository repository) {
        this.repository = repository;
    }

    public List<OrderAdjustmentType> list() {
        return repository.findAll();
    }

    public OrderAdjustmentType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentType %d not found".formatted(id)));
    }

    public OrderAdjustmentType create(OrderAdjustmentType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderAdjustmentType update(Long id, OrderAdjustmentType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}