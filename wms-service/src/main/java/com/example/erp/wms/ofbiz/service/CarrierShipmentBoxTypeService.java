package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.CarrierShipmentBoxType;
import com.example.erp.wms.ofbiz.repository.CarrierShipmentBoxTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarrierShipmentBoxTypeService {

    private final CarrierShipmentBoxTypeRepository repository;

    public CarrierShipmentBoxTypeService(CarrierShipmentBoxTypeRepository repository) {
        this.repository = repository;
    }

    public List<CarrierShipmentBoxType> list() {
        return repository.findAll();
    }

    public CarrierShipmentBoxType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CarrierShipmentBoxType %d not found".formatted(id)));
    }

    public CarrierShipmentBoxType create(CarrierShipmentBoxType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CarrierShipmentBoxType update(Long id, CarrierShipmentBoxType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CarrierShipmentBoxType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}