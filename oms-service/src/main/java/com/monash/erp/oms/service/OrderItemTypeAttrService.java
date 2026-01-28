package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemTypeAttr;
import com.monash.erp.oms.repository.OrderItemTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemTypeAttrService {

    private final OrderItemTypeAttrRepository repository;

    public OrderItemTypeAttrService(OrderItemTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemTypeAttr> list() {
        return repository.findAll();
    }

    public OrderItemTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemTypeAttr %d not found".formatted(id)));
    }

    public OrderItemTypeAttr create(OrderItemTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemTypeAttr update(Long id, OrderItemTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}