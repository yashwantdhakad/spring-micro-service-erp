package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemRole;
import com.monash.erp.oms.repository.OrderItemRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemRoleService {

    private final OrderItemRoleRepository repository;

    public OrderItemRoleService(OrderItemRoleRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemRole> list() {
        return repository.findAll();
    }

    public OrderItemRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemRole %d not found".formatted(id)));
    }

    public OrderItemRole create(OrderItemRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemRole update(Long id, OrderItemRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}