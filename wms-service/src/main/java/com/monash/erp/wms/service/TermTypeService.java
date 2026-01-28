package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TermType;
import com.monash.erp.wms.repository.TermTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TermTypeService {

    private final TermTypeRepository repository;

    public TermTypeService(TermTypeRepository repository) {
        this.repository = repository;
    }

    public List<TermType> list() {
        return repository.findAll();
    }

    public TermType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TermType %d not found".formatted(id)));
    }

    public TermType create(TermType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TermType update(Long id, TermType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TermType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}