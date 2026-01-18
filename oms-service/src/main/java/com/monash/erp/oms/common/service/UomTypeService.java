package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.UomType;
import com.monash.erp.oms.common.repository.UomTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UomTypeService {

    private final UomTypeRepository repository;

    public UomTypeService(UomTypeRepository repository) {
        this.repository = repository;
    }

    public List<UomType> list() {
        return repository.findAll();
    }

    public UomType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UomType %d not found".formatted(id)));
    }

    public UomType create(UomType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UomType update(Long id, UomType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UomType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
