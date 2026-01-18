package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DataTemplateType;
import com.monash.erp.wms.repository.DataTemplateTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DataTemplateTypeService {

    private final DataTemplateTypeRepository repository;

    public DataTemplateTypeService(DataTemplateTypeRepository repository) {
        this.repository = repository;
    }

    public List<DataTemplateType> list() {
        return repository.findAll();
    }

    public DataTemplateType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DataTemplateType %d not found".formatted(id)));
    }

    public DataTemplateType create(DataTemplateType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DataTemplateType update(Long id, DataTemplateType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DataTemplateType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}