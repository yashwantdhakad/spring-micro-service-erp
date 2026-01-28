package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DeductionType;
import com.monash.erp.wms.repository.DeductionTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DeductionTypeService {

    private final DeductionTypeRepository repository;

    public DeductionTypeService(DeductionTypeRepository repository) {
        this.repository = repository;
    }

    public List<DeductionType> list() {
        return repository.findAll();
    }

    public DeductionType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DeductionType %d not found".formatted(id)));
    }

    public DeductionType create(DeductionType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DeductionType update(Long id, DeductionType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DeductionType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}