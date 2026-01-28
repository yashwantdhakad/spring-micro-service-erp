package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderWorkEffortAppl;
import com.monash.erp.oms.repository.OrderWorkEffortApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderWorkEffortApplService {

    private final OrderWorkEffortApplRepository repository;

    public OrderWorkEffortApplService(OrderWorkEffortApplRepository repository) {
        this.repository = repository;
    }

    public List<OrderWorkEffortAppl> list() {
        return repository.findAll();
    }

    public OrderWorkEffortAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderWorkEffortAppl %d not found".formatted(id)));
    }

    public OrderWorkEffortAppl create(OrderWorkEffortAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderWorkEffortAppl update(Long id, OrderWorkEffortAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderWorkEffortAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}