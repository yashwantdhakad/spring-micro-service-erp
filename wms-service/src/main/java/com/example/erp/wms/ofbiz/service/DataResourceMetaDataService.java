package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.DataResourceMetaData;
import com.example.erp.wms.ofbiz.repository.DataResourceMetaDataRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataResourceMetaDataService {

    private final DataResourceMetaDataRepository repository;

    public DataResourceMetaDataService(DataResourceMetaDataRepository repository) {
        this.repository = repository;
    }

    public List<DataResourceMetaData> list() {
        return repository.findAll();
    }

    public DataResourceMetaData get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceMetaData %d not found".formatted(id)));
    }

    public DataResourceMetaData create(DataResourceMetaData entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataResourceMetaData update(Long id, DataResourceMetaData entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResourceMetaData %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}