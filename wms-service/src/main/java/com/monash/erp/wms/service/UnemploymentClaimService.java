package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.UnemploymentClaim;
import com.monash.erp.wms.repository.UnemploymentClaimRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UnemploymentClaimService {

    private final UnemploymentClaimRepository repository;

    public UnemploymentClaimService(UnemploymentClaimRepository repository) {
        this.repository = repository;
    }

    public List<UnemploymentClaim> list() {
        return repository.findAll();
    }

    public UnemploymentClaim get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UnemploymentClaim %d not found".formatted(id)));
    }

    public UnemploymentClaim create(UnemploymentClaim entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UnemploymentClaim update(Long id, UnemploymentClaim entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UnemploymentClaim %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}