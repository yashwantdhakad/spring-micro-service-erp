package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FixedAssetMaintOrder;
import com.monash.erp.wms.repository.FixedAssetMaintOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetMaintOrderService {

    private final FixedAssetMaintOrderRepository repository;

    public FixedAssetMaintOrderService(FixedAssetMaintOrderRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetMaintOrder> list() {
        return repository.findAll();
    }

    public FixedAssetMaintOrder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMaintOrder %d not found".formatted(id)));
    }

    public FixedAssetMaintOrder create(FixedAssetMaintOrder entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetMaintOrder update(Long id, FixedAssetMaintOrder entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMaintOrder %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}