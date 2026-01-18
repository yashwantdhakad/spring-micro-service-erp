package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DataResource;
import com.monash.erp.wms.repository.DataResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataResourceService {

    private final DataResourceRepository repository;

    public DataResourceService(DataResourceRepository repository) {
        this.repository = repository;
    }

    public List<DataResource> list() {
        return repository.findAll();
    }

    public DataResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResource %d not found".formatted(id)));
    }

    public DataResource create(DataResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataResource update(Long id, DataResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}