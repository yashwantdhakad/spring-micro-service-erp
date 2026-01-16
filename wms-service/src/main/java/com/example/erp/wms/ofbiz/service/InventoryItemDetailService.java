package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.InventoryItemDetail;
import com.example.erp.wms.ofbiz.repository.InventoryItemDetailRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemDetailService {

    private final InventoryItemDetailRepository repository;

    public InventoryItemDetailService(InventoryItemDetailRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemDetail> list() {
        return repository.findAll();
    }

    public InventoryItemDetail get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemDetail %d not found".formatted(id)));
    }

    public InventoryItemDetail create(InventoryItemDetail entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemDetail update(Long id, InventoryItemDetail entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemDetail %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}