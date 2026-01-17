package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DataResourceAttribute;
import com.example.erp.wms.ofbiz.repository.DataResourceAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataResourceAttributeService {

    private final DataResourceAttributeRepository repository;

    public DataResourceAttributeService(DataResourceAttributeRepository repository) {
        this.repository = repository;
    }

    public List<DataResourceAttribute> list() {
        return repository.findAll();
    }

    public DataResourceAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceAttribute %d not found".formatted(id)));
    }

    public DataResourceAttribute create(DataResourceAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataResourceAttribute update(Long id, DataResourceAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}