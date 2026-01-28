package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProductPromoCodeParty;
import com.monash.erp.wms.repository.ProductPromoCodePartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductPromoCodePartyService {

    private final ProductPromoCodePartyRepository repository;

    public ProductPromoCodePartyService(ProductPromoCodePartyRepository repository) {
        this.repository = repository;
    }

    public List<ProductPromoCodeParty> list() {
        return repository.findAll();
    }

    public ProductPromoCodeParty get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCodeParty %d not found".formatted(id)));
    }

    public ProductPromoCodeParty create(ProductPromoCodeParty entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProductPromoCodeParty update(Long id, ProductPromoCodeParty entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductPromoCodeParty %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}