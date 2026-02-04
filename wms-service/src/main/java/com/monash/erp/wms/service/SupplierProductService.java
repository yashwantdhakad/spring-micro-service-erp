package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SupplierProduct;
import com.monash.erp.wms.repository.SupplierProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class SupplierProductService {

    private final SupplierProductRepository repository;

    public SupplierProductService(SupplierProductRepository repository) {
        this.repository = repository;
    }

    public List<SupplierProduct> list() {
        return repository.findAll();
    }

    public List<SupplierProduct> listByPartyId(String partyId) {
        return repository.findByPartyId(partyId);
    }

    public List<SupplierProduct> listByProductId(String productId) {
        return repository.findByProductId(productId);
    }

    public Optional<SupplierProduct> findLatestByPartyAndProduct(String partyId, String productId) {
        return repository.findTopByPartyIdAndProductIdOrderByIdDesc(partyId, productId);
    }

    public SupplierProduct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierProduct %d not found".formatted(id)));
    }

    public SupplierProduct create(SupplierProduct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SupplierProduct update(Long id, SupplierProduct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierProduct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
