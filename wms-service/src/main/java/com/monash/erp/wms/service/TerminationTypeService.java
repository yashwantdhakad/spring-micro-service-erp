package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TerminationType;
import com.monash.erp.wms.repository.TerminationTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TerminationTypeService {

    private final TerminationTypeRepository repository;

    public TerminationTypeService(TerminationTypeRepository repository) {
        this.repository = repository;
    }

    public List<TerminationType> list() {
        return repository.findAll();
    }

    public TerminationType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TerminationType %d not found".formatted(id)));
    }

    public TerminationType create(TerminationType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TerminationType update(Long id, TerminationType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TerminationType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}