package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.ProdCatalogInvFacility;
import com.monash.erp.oms.repository.ProdCatalogInvFacilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdCatalogInvFacilityService {

    private final ProdCatalogInvFacilityRepository repository;

    public ProdCatalogInvFacilityService(ProdCatalogInvFacilityRepository repository) {
        this.repository = repository;
    }

    public List<ProdCatalogInvFacility> list() {
        return repository.findAll();
    }

    public ProdCatalogInvFacility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogInvFacility %d not found".formatted(id)));
    }

    public ProdCatalogInvFacility create(ProdCatalogInvFacility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProdCatalogInvFacility update(Long id, ProdCatalogInvFacility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdCatalogInvFacility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}