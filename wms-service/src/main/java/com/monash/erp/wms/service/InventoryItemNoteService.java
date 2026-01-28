package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemNote;
import com.monash.erp.wms.repository.InventoryItemNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InventoryItemNoteService {

    private final InventoryItemNoteRepository repository;

    public InventoryItemNoteService(InventoryItemNoteRepository repository) {
        this.repository = repository;
    }

    public List<InventoryItemNote> list() {
        return repository.findAll();
    }

    public InventoryItemNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemNote %d not found".formatted(id)));
    }

    public InventoryItemNote create(InventoryItemNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InventoryItemNote update(Long id, InventoryItemNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}