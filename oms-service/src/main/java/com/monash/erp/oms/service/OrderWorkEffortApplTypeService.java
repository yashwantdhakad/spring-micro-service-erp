package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderWorkEffortApplType;
import com.monash.erp.oms.repository.OrderWorkEffortApplTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderWorkEffortApplTypeService {

    private final OrderWorkEffortApplTypeRepository repository;

    public OrderWorkEffortApplTypeService(OrderWorkEffortApplTypeRepository repository) {
        this.repository = repository;
    }

    public List<OrderWorkEffortApplType> list() {
        return repository.findAll();
    }

    public OrderWorkEffortApplType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderWorkEffortApplType %d not found".formatted(id)));
    }

    public OrderWorkEffortApplType create(OrderWorkEffortApplType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderWorkEffortApplType update(Long id, OrderWorkEffortApplType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderWorkEffortApplType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}