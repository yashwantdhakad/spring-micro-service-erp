package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.CarrierShipmentMethod;
import com.example.erp.wms.ofbiz.repository.CarrierShipmentMethodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarrierShipmentMethodService {

    private final CarrierShipmentMethodRepository repository;

    public CarrierShipmentMethodService(CarrierShipmentMethodRepository repository) {
        this.repository = repository;
    }

    public List<CarrierShipmentMethod> list() {
        return repository.findAll();
    }

    public CarrierShipmentMethod get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CarrierShipmentMethod %d not found".formatted(id)));
    }

    public CarrierShipmentMethod create(CarrierShipmentMethod entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CarrierShipmentMethod update(Long id, CarrierShipmentMethod entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CarrierShipmentMethod %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}