package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.CustomScreenType;
import com.example.erp.oms.common.repository.CustomScreenTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomScreenTypeService {

    private final CustomScreenTypeRepository repository;

    public CustomScreenTypeService(CustomScreenTypeRepository repository) {
        this.repository = repository;
    }

    public List<CustomScreenType> list() {
        return repository.findAll();
    }

    public CustomScreenType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomScreenType %d not found".formatted(id)));
    }

    public CustomScreenType create(CustomScreenType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustomScreenType update(Long id, CustomScreenType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomScreenType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
