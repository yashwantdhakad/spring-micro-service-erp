package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DataResourceTypeAttr;
import com.example.erp.wms.ofbiz.repository.DataResourceTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataResourceTypeAttrService {

    private final DataResourceTypeAttrRepository repository;

    public DataResourceTypeAttrService(DataResourceTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<DataResourceTypeAttr> list() {
        return repository.findAll();
    }

    public DataResourceTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceTypeAttr %d not found".formatted(id)));
    }

    public DataResourceTypeAttr create(DataResourceTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataResourceTypeAttr update(Long id, DataResourceTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}