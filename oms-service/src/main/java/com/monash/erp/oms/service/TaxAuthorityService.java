package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxAuthority;
import com.monash.erp.oms.repository.TaxAuthorityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxAuthorityService {

    private final TaxAuthorityRepository repository;

    public TaxAuthorityService(TaxAuthorityRepository repository) {
        this.repository = repository;
    }

    public List<TaxAuthority> list() {
        return repository.findAll();
    }

    public TaxAuthority get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthority %d not found".formatted(id)));
    }

    public TaxAuthority create(TaxAuthority entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxAuthority update(Long id, TaxAuthority entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxAuthority %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}