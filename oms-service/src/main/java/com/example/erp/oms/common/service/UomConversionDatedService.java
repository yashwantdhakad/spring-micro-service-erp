package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.UomConversionDated;
import com.example.erp.oms.common.repository.UomConversionDatedRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UomConversionDatedService {

    private final UomConversionDatedRepository repository;

    public UomConversionDatedService(UomConversionDatedRepository repository) {
        this.repository = repository;
    }

    public List<UomConversionDated> list() {
        return repository.findAll();
    }

    public UomConversionDated get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UomConversionDated %d not found".formatted(id)));
    }

    public UomConversionDated create(UomConversionDated entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UomConversionDated update(Long id, UomConversionDated entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UomConversionDated %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
