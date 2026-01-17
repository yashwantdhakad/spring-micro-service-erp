package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlFiscalType;
import com.example.erp.oms.accounting.repository.GlFiscalTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlFiscalTypeService {

    private final GlFiscalTypeRepository repository;

    public GlFiscalTypeService(GlFiscalTypeRepository repository) {
        this.repository = repository;
    }

    public List<GlFiscalType> list() {
        return repository.findAll();
    }

    public GlFiscalType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlFiscalType %d not found".formatted(id)));
    }

    public GlFiscalType create(GlFiscalType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlFiscalType update(Long id, GlFiscalType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlFiscalType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
