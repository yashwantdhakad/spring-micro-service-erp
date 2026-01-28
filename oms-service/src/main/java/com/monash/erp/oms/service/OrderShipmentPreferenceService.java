package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderShipmentPreference;
import com.monash.erp.oms.repository.OrderShipmentPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderShipmentPreferenceService {

    private final OrderShipmentPreferenceRepository repository;

    public OrderShipmentPreferenceService(OrderShipmentPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<OrderShipmentPreference> list() {
        return repository.findAll();
    }

    public OrderShipmentPreference get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderShipmentPreference %d not found".formatted(id)));
    }

    public OrderShipmentPreference create(OrderShipmentPreference entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderShipmentPreference update(Long id, OrderShipmentPreference entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderShipmentPreference %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}