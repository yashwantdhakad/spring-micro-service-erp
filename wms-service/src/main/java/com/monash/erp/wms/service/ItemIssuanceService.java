package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ItemIssuance;
import com.monash.erp.wms.repository.ItemIssuanceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ItemIssuanceService {

    private final ItemIssuanceRepository repository;

    public ItemIssuanceService(ItemIssuanceRepository repository) {
        this.repository = repository;
    }

    public List<ItemIssuance> list() {
        return repository.findAll();
    }

    public ItemIssuance get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ItemIssuance %d not found".formatted(id)));
    }

    public ItemIssuance create(ItemIssuance entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ItemIssuance update(Long id, ItemIssuance entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ItemIssuance %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}