package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.repository.InventoryItemDetailRepository;
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

    public List<InventoryItemDetail> listByWorkEffortId(String workEffortId) {
        if (isBlank(workEffortId)) {
            return List.of();
        }
        return repository.findByWorkEffortId(workEffortId);
    }

    public InventoryItemDetail get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InventoryItemDetail %d not found".formatted(id)));
    }

    public InventoryItemDetail create(InventoryItemDetail entity) {
        entity.setId(null);
        InventoryItemDetail saved = repository.save(entity);
        if (isBlank(saved.getInventoryItemDetailSeqId())) {
            saved.setInventoryItemDetailSeqId(String.valueOf(saved.getId()));
            saved = repository.save(saved);
        }
        return saved;
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

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
