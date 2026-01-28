package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.RateType;
import com.monash.erp.wms.repository.RateTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RateTypeService {

    private final RateTypeRepository repository;

    public RateTypeService(RateTypeRepository repository) {
        this.repository = repository;
    }

    public List<RateType> list() {
        return repository.findAll();
    }

    public RateType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "RateType %d not found".formatted(id)));
    }

    public RateType create(RateType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public RateType update(Long id, RateType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "RateType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}