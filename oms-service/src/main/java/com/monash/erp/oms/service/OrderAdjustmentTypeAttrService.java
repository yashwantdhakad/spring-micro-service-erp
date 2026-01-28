package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderAdjustmentTypeAttr;
import com.monash.erp.oms.repository.OrderAdjustmentTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderAdjustmentTypeAttrService {

    private final OrderAdjustmentTypeAttrRepository repository;

    public OrderAdjustmentTypeAttrService(OrderAdjustmentTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<OrderAdjustmentTypeAttr> list() {
        return repository.findAll();
    }

    public OrderAdjustmentTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentTypeAttr %d not found".formatted(id)));
    }

    public OrderAdjustmentTypeAttr create(OrderAdjustmentTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderAdjustmentTypeAttr update(Long id, OrderAdjustmentTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderAdjustmentTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}