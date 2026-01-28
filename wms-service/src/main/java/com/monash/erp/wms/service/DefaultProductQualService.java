package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DefaultProductQual;
import com.monash.erp.wms.repository.DefaultProductQualRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DefaultProductQualService {

    private final DefaultProductQualRepository repository;

    public DefaultProductQualService(DefaultProductQualRepository repository) {
        this.repository = repository;
    }

    public List<DefaultProductQual> list() {
        return repository.findAll();
    }

    public DefaultProductQual get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DefaultProductQual %d not found".formatted(id)));
    }

    public DefaultProductQual create(DefaultProductQual entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DefaultProductQual update(Long id, DefaultProductQual entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DefaultProductQual %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}