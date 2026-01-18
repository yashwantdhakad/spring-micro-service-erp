package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.GoodIdentificationType;
import com.monash.erp.wms.repository.GoodIdentificationTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GoodIdentificationTypeService {

    private final GoodIdentificationTypeRepository repository;

    public GoodIdentificationTypeService(GoodIdentificationTypeRepository repository) {
        this.repository = repository;
    }

    public List<GoodIdentificationType> list() {
        return repository.findAll();
    }

    public GoodIdentificationType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GoodIdentificationType %d not found".formatted(id)));
    }

    public GoodIdentificationType create(GoodIdentificationType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GoodIdentificationType update(Long id, GoodIdentificationType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GoodIdentificationType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}