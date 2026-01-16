package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentItem;
import com.example.erp.wms.ofbiz.repository.ShipmentItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentItemService {

    private final ShipmentItemRepository repository;

    public ShipmentItemService(ShipmentItemRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentItem> list() {
        return repository.findAll();
    }

    public ShipmentItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItem %d not found".formatted(id)));
    }

    public ShipmentItem create(ShipmentItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentItem update(Long id, ShipmentItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}