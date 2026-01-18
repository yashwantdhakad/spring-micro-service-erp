package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.PortalPageColumn;
import com.monash.erp.oms.common.repository.PortalPageColumnRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PortalPageColumnService {

    private final PortalPageColumnRepository repository;

    public PortalPageColumnService(PortalPageColumnRepository repository) {
        this.repository = repository;
    }

    public List<PortalPageColumn> list() {
        return repository.findAll();
    }

    public PortalPageColumn get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPageColumn %d not found".formatted(id)));
    }

    public PortalPageColumn create(PortalPageColumn entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PortalPageColumn update(Long id, PortalPageColumn entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PortalPageColumn %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
