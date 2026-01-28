package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Tenant;
import com.monash.erp.wms.repository.TenantRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TenantService {

    private final TenantRepository repository;

    public TenantService(TenantRepository repository) {
        this.repository = repository;
    }

    public List<Tenant> list() {
        return repository.findAll();
    }

    public Tenant get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tenant %d not found".formatted(id)));
    }

    public Tenant create(Tenant entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Tenant update(Long id, Tenant entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Tenant %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}