package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderRole;
import com.monash.erp.oms.repository.OrderRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderRoleService {

    private final OrderRoleRepository repository;

    public OrderRoleService(OrderRoleRepository repository) {
        this.repository = repository;
    }

    public List<OrderRole> list() {
        return repository.findAll();
    }

    public OrderRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderRole %d not found".formatted(id)));
    }

    public OrderRole create(OrderRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderRole update(Long id, OrderRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}