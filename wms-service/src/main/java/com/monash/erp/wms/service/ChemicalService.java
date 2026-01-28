package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Chemical;
import com.monash.erp.wms.repository.ChemicalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ChemicalService {

    private final ChemicalRepository repository;

    public ChemicalService(ChemicalRepository repository) {
        this.repository = repository;
    }

    public List<Chemical> list() {
        return repository.findAll();
    }

    public Chemical get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Chemical %d not found".formatted(id)));
    }

    public Chemical create(Chemical entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Chemical update(Long id, Chemical entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Chemical %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}