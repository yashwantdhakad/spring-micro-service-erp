package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentPackage;
import com.example.erp.wms.ofbiz.repository.ShipmentPackageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentPackageService {

    private final ShipmentPackageRepository repository;

    public ShipmentPackageService(ShipmentPackageRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentPackage> list() {
        return repository.findAll();
    }

    public ShipmentPackage get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentPackage %d not found".formatted(id)));
    }

    public ShipmentPackage create(ShipmentPackage entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentPackage update(Long id, ShipmentPackage entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentPackage %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}