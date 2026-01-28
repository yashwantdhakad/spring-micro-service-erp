package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ChemicalComponent;
import com.monash.erp.wms.repository.ChemicalComponentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ChemicalComponentService {

    private final ChemicalComponentRepository repository;

    public ChemicalComponentService(ChemicalComponentRepository repository) {
        this.repository = repository;
    }

    public List<ChemicalComponent> list() {
        return repository.findAll();
    }

    public ChemicalComponent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ChemicalComponent %d not found".formatted(id)));
    }

    public ChemicalComponent create(ChemicalComponent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ChemicalComponent update(Long id, ChemicalComponent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ChemicalComponent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}