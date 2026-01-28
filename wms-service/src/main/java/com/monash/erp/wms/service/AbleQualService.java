package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AbleQual;
import com.monash.erp.wms.repository.AbleQualRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AbleQualService {

    private final AbleQualRepository repository;

    public AbleQualService(AbleQualRepository repository) {
        this.repository = repository;
    }

    public List<AbleQual> list() {
        return repository.findAll();
    }

    public AbleQual get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleQual %d not found".formatted(id)));
    }

    public AbleQual create(AbleQual entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AbleQual update(Long id, AbleQual entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleQual %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}