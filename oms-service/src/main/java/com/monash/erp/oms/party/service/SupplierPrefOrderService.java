package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.SupplierPrefOrder;
import com.monash.erp.oms.party.repository.SupplierPrefOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SupplierPrefOrderService {

    private final SupplierPrefOrderRepository repository;

    public SupplierPrefOrderService(SupplierPrefOrderRepository repository) {
        this.repository = repository;
    }

    public List<SupplierPrefOrder> list() {
        return repository.findAll();
    }

    public SupplierPrefOrder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierPrefOrder %d not found".formatted(id)));
    }

    public SupplierPrefOrder create(SupplierPrefOrder entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SupplierPrefOrder update(Long id, SupplierPrefOrder entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierPrefOrder %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}