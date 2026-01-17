package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.DataSourceType;
import com.example.erp.oms.common.repository.DataSourceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataSourceTypeService {

    private final DataSourceTypeRepository repository;

    public DataSourceTypeService(DataSourceTypeRepository repository) {
        this.repository = repository;
    }

    public List<DataSourceType> list() {
        return repository.findAll();
    }

    public DataSourceType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataSourceType %d not found".formatted(id)));
    }

    public DataSourceType create(DataSourceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataSourceType update(Long id, DataSourceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataSourceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
