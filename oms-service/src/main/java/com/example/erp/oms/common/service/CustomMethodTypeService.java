package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.CustomMethodType;
import com.example.erp.oms.common.repository.CustomMethodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomMethodTypeService {

    private final CustomMethodTypeRepository repository;

    public CustomMethodTypeService(CustomMethodTypeRepository repository) {
        this.repository = repository;
    }

    public List<CustomMethodType> list() {
        return repository.findAll();
    }

    public CustomMethodType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomMethodType %d not found".formatted(id)));
    }

    public CustomMethodType create(CustomMethodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustomMethodType update(Long id, CustomMethodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomMethodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
