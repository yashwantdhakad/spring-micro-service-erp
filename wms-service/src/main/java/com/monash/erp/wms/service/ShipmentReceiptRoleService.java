package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentReceiptRole;
import com.monash.erp.wms.repository.ShipmentReceiptRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentReceiptRoleService {

    private final ShipmentReceiptRoleRepository repository;

    public ShipmentReceiptRoleService(ShipmentReceiptRoleRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentReceiptRole> list() {
        return repository.findAll();
    }

    public ShipmentReceiptRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentReceiptRole %d not found".formatted(id)));
    }

    public ShipmentReceiptRole create(ShipmentReceiptRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentReceiptRole update(Long id, ShipmentReceiptRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentReceiptRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}