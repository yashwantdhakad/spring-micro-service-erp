package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderTypeAttr;
import com.monash.erp.oms.repository.OrderTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderTypeAttrService {

    private final OrderTypeAttrRepository repository;

    public OrderTypeAttrService(OrderTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<OrderTypeAttr> list() {
        return repository.findAll();
    }

    public OrderTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderTypeAttr %d not found".formatted(id)));
    }

    public OrderTypeAttr create(OrderTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderTypeAttr update(Long id, OrderTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}