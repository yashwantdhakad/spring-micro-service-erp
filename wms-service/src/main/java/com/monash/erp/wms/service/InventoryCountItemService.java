package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryCountItem;
import com.monash.erp.wms.repository.InventoryCountItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryCountItemService {

    private final InventoryCountItemRepository repository;

    public InventoryCountItemService(InventoryCountItemRepository repository) {
        this.repository = repository;
    }

    public List<InventoryCountItem> list() {
        return repository.findAll();
    }

    public InventoryCountItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryCountItem %d not found".formatted(id)));
    }

    public InventoryCountItem create(InventoryCountItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryCountItem update(Long id, InventoryCountItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryCountItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}