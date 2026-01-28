package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AbleBusinessDefinition;
import com.monash.erp.wms.repository.AbleBusinessDefinitionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AbleBusinessDefinitionService {

    private final AbleBusinessDefinitionRepository repository;

    public AbleBusinessDefinitionService(AbleBusinessDefinitionRepository repository) {
        this.repository = repository;
    }

    public List<AbleBusinessDefinition> list() {
        return repository.findAll();
    }

    public AbleBusinessDefinition get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleBusinessDefinition %d not found".formatted(id)));
    }

    public AbleBusinessDefinition create(AbleBusinessDefinition entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AbleBusinessDefinition update(Long id, AbleBusinessDefinition entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleBusinessDefinition %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}