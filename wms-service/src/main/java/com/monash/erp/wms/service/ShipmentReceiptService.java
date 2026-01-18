package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentReceipt;
import com.monash.erp.wms.repository.ShipmentReceiptRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentReceiptService {

    private final ShipmentReceiptRepository repository;

    public ShipmentReceiptService(ShipmentReceiptRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentReceipt> list() {
        return repository.findAll();
    }

    public ShipmentReceipt get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentReceipt %d not found".formatted(id)));
    }

    public ShipmentReceipt create(ShipmentReceipt entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentReceipt update(Long id, ShipmentReceipt entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentReceipt %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}