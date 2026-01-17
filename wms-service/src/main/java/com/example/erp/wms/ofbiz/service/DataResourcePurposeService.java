package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DataResourcePurpose;
import com.example.erp.wms.ofbiz.repository.DataResourcePurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataResourcePurposeService {

    private final DataResourcePurposeRepository repository;

    public DataResourcePurposeService(DataResourcePurposeRepository repository) {
        this.repository = repository;
    }

    public List<DataResourcePurpose> list() {
        return repository.findAll();
    }

    public DataResourcePurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourcePurpose %d not found".formatted(id)));
    }

    public DataResourcePurpose create(DataResourcePurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataResourcePurpose update(Long id, DataResourcePurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourcePurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}