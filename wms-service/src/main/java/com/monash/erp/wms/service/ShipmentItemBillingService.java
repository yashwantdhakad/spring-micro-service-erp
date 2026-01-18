package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentItemBilling;
import com.monash.erp.wms.repository.ShipmentItemBillingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentItemBillingService {

    private final ShipmentItemBillingRepository repository;

    public ShipmentItemBillingService(ShipmentItemBillingRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentItemBilling> list() {
        return repository.findAll();
    }

    public ShipmentItemBilling get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItemBilling %d not found".formatted(id)));
    }

    public ShipmentItemBilling create(ShipmentItemBilling entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentItemBilling update(Long id, ShipmentItemBilling entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItemBilling %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}