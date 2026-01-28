package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TenantDataSource;
import com.monash.erp.wms.repository.TenantDataSourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TenantDataSourceService {

    private final TenantDataSourceRepository repository;

    public TenantDataSourceService(TenantDataSourceRepository repository) {
        this.repository = repository;
    }

    public List<TenantDataSource> list() {
        return repository.findAll();
    }

    public TenantDataSource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TenantDataSource %d not found".formatted(id)));
    }

    public TenantDataSource create(TenantDataSource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TenantDataSource update(Long id, TenantDataSource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TenantDataSource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}