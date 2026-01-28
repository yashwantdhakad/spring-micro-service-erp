package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PlatformType;
import com.monash.erp.wms.repository.PlatformTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PlatformTypeService {

    private final PlatformTypeRepository repository;

    public PlatformTypeService(PlatformTypeRepository repository) {
        this.repository = repository;
    }

    public List<PlatformType> list() {
        return repository.findAll();
    }

    public PlatformType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PlatformType %d not found".formatted(id)));
    }

    public PlatformType create(PlatformType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PlatformType update(Long id, PlatformType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PlatformType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}