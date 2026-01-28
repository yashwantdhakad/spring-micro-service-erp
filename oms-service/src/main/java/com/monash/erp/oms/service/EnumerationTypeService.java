package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.EnumerationType;
import com.monash.erp.oms.repository.EnumerationTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EnumerationTypeService {

    private final EnumerationTypeRepository repository;

    public EnumerationTypeService(EnumerationTypeRepository repository) {
        this.repository = repository;
    }

    public List<EnumerationType> list() {
        return repository.findAll();
    }

    public EnumerationType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EnumerationType %d not found".formatted(id)));
    }

    public EnumerationType create(EnumerationType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EnumerationType update(Long id, EnumerationType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EnumerationType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}