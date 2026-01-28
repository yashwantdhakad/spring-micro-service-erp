package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ChemicalHazard;
import com.monash.erp.wms.repository.ChemicalHazardRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ChemicalHazardService {

    private final ChemicalHazardRepository repository;

    public ChemicalHazardService(ChemicalHazardRepository repository) {
        this.repository = repository;
    }

    public List<ChemicalHazard> list() {
        return repository.findAll();
    }

    public ChemicalHazard get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ChemicalHazard %d not found".formatted(id)));
    }

    public ChemicalHazard create(ChemicalHazard entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ChemicalHazard update(Long id, ChemicalHazard entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ChemicalHazard %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}