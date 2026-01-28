package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderItemAssociation;
import com.monash.erp.oms.repository.OrderItemAssociationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderItemAssociationService {

    private final OrderItemAssociationRepository repository;

    public OrderItemAssociationService(OrderItemAssociationRepository repository) {
        this.repository = repository;
    }

    public List<OrderItemAssociation> list() {
        return repository.findAll();
    }

    public OrderItemAssociation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAssociation %d not found".formatted(id)));
    }

    public OrderItemAssociation create(OrderItemAssociation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderItemAssociation update(Long id, OrderItemAssociation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderItemAssociation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}