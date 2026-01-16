package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentPackageContent;
import com.example.erp.wms.ofbiz.repository.ShipmentPackageContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentPackageContentService {

    private final ShipmentPackageContentRepository repository;

    public ShipmentPackageContentService(ShipmentPackageContentRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentPackageContent> list() {
        return repository.findAll();
    }

    public ShipmentPackageContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentPackageContent %d not found".formatted(id)));
    }

    public ShipmentPackageContent create(ShipmentPackageContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentPackageContent update(Long id, ShipmentPackageContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentPackageContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}