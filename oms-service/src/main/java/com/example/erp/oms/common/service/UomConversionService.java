package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.UomConversion;
import com.example.erp.oms.common.repository.UomConversionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UomConversionService {

    private final UomConversionRepository repository;

    public UomConversionService(UomConversionRepository repository) {
        this.repository = repository;
    }

    public List<UomConversion> list() {
        return repository.findAll();
    }

    public UomConversion get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UomConversion %d not found".formatted(id)));
    }

    public UomConversion create(UomConversion entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UomConversion update(Long id, UomConversion entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UomConversion %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
