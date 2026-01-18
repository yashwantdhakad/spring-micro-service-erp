package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GlXbrlClass;
import com.monash.erp.oms.accounting.repository.GlXbrlClassRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlXbrlClassService {

    private final GlXbrlClassRepository repository;

    public GlXbrlClassService(GlXbrlClassRepository repository) {
        this.repository = repository;
    }

    public List<GlXbrlClass> list() {
        return repository.findAll();
    }

    public GlXbrlClass get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlXbrlClass %d not found".formatted(id)));
    }

    public GlXbrlClass create(GlXbrlClass entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlXbrlClass update(Long id, GlXbrlClass entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlXbrlClass %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
