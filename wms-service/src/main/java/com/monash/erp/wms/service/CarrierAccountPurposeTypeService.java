package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CarrierAccountPurposeType;
import com.monash.erp.wms.repository.CarrierAccountPurposeTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarrierAccountPurposeTypeService {

    private final CarrierAccountPurposeTypeRepository repository;

    public CarrierAccountPurposeTypeService(CarrierAccountPurposeTypeRepository repository) {
        this.repository = repository;
    }

    public List<CarrierAccountPurposeType> list() {
        return repository.findAll();
    }

    public CarrierAccountPurposeType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CarrierAccountPurposeType %d not found".formatted(id)));
    }

    public CarrierAccountPurposeType create(CarrierAccountPurposeType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CarrierAccountPurposeType update(Long id, CarrierAccountPurposeType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CarrierAccountPurposeType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}