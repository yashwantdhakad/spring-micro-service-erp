package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ContainerType;
import com.example.erp.wms.ofbiz.repository.ContainerTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContainerTypeService {

    private final ContainerTypeRepository repository;

    public ContainerTypeService(ContainerTypeRepository repository) {
        this.repository = repository;
    }

    public List<ContainerType> list() {
        return repository.findAll();
    }

    public ContainerType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContainerType %d not found".formatted(id)));
    }

    public ContainerType create(ContainerType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContainerType update(Long id, ContainerType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContainerType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}