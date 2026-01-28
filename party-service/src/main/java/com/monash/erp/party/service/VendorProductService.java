package com.monash.erp.party.service;

import com.monash.erp.party.entity.VendorProduct;
import com.monash.erp.party.repository.VendorProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VendorProductService {

    private final VendorProductRepository repository;

    public VendorProductService(VendorProductRepository repository) {
        this.repository = repository;
    }

    public List<VendorProduct> list() {
        return repository.findAll();
    }

    public VendorProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VendorProduct %d not found".formatted(id)));
    }

    public VendorProduct create(VendorProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VendorProduct update(Long id, VendorProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VendorProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}