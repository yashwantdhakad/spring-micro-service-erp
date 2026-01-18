package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.DataSource;
import com.monash.erp.oms.common.repository.DataSourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataSourceService {

    private final DataSourceRepository repository;

    public DataSourceService(DataSourceRepository repository) {
        this.repository = repository;
    }

    public List<DataSource> list() {
        return repository.findAll();
    }

    public DataSource get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataSource %d not found".formatted(id)));
    }

    public DataSource create(DataSource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataSource update(Long id, DataSource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataSource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
