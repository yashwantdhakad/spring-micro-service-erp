package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryTransfer;
import com.monash.erp.wms.repository.InventoryTransferRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryTransferService {

    private final InventoryTransferRepository repository;

    public InventoryTransferService(InventoryTransferRepository repository) {
        this.repository = repository;
    }

    public List<InventoryTransfer> list() {
        return repository.findAll();
    }

    public InventoryTransfer get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryTransfer %d not found".formatted(id)));
    }

    public InventoryTransfer create(InventoryTransfer entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryTransfer update(Long id, InventoryTransfer entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryTransfer %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}