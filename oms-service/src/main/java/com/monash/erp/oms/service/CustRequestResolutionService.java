package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestResolution;
import com.monash.erp.oms.repository.CustRequestResolutionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestResolutionService {

    private final CustRequestResolutionRepository repository;

    public CustRequestResolutionService(CustRequestResolutionRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestResolution> list() {
        return repository.findAll();
    }

    public CustRequestResolution get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestResolution %d not found".formatted(id)));
    }

    public CustRequestResolution create(CustRequestResolution entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestResolution update(Long id, CustRequestResolution entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestResolution %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}