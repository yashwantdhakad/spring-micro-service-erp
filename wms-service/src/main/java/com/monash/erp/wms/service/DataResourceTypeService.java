package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DataResourceType;
import com.monash.erp.wms.repository.DataResourceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataResourceTypeService {

    private final DataResourceTypeRepository repository;

    public DataResourceTypeService(DataResourceTypeRepository repository) {
        this.repository = repository;
    }

    public List<DataResourceType> list() {
        return repository.findAll();
    }

    public DataResourceType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceType %d not found".formatted(id)));
    }

    public DataResourceType create(DataResourceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataResourceType update(Long id, DataResourceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}