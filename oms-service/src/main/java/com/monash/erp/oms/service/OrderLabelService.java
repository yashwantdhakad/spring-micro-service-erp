package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderLabel;
import com.monash.erp.oms.repository.OrderLabelRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderLabelService {

    private final OrderLabelRepository repository;

    public OrderLabelService(OrderLabelRepository repository) {
        this.repository = repository;
    }

    public List<OrderLabel> list() {
        return repository.findAll();
    }

    public OrderLabel get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderLabel %d not found".formatted(id)));
    }

    public OrderLabel create(OrderLabel entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderLabel update(Long id, OrderLabel entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderLabel %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}